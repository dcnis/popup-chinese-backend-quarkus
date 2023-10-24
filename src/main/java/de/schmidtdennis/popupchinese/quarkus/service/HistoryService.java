package de.schmidtdennis.popupchinese.quarkus.service;

import de.schmidtdennis.popupchinese.quarkus.converter.HistoryConverter;
import de.schmidtdennis.popupchinese.quarkus.model.dataobject.HistoryItemDO;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.HistoryItemVO;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class HistoryService {

    @Inject
    private HistoryConverter historyConverter;

    @Transactional
    public HistoryItemVO add(String userEmail, Long lessonId){
        HistoryItemDO newHistoryItem = new HistoryItemDO();
        newHistoryItem.setUserEmail(userEmail);
        newHistoryItem.setLessonId(lessonId);
        newHistoryItem.setGmtTimestamp(System.currentTimeMillis());
        newHistoryItem.persist();
        return historyConverter.toVO(newHistoryItem);
    }

    public List<HistoryItemVO> getAll(String userEmail) {
        List<HistoryItemDO> historyItemDOs = HistoryItemDO.find("userEmail", Sort.descending("gmtTimestamp"), userEmail).list();

        return historyItemDOs.stream()
                .map(historyItemDO -> historyConverter.toVO(historyItemDO))
                .collect(Collectors.toList());
    }
}

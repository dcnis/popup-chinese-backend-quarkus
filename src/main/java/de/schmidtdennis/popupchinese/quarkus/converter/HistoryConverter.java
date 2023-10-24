package de.schmidtdennis.popupchinese.quarkus.converter;

import de.schmidtdennis.popupchinese.quarkus.model.dataobject.HistoryItemDO;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.HistoryItemVO;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HistoryConverter {

    public HistoryItemVO toVO(HistoryItemDO historyItemDO) {
        HistoryItemVO historyItemVO = new HistoryItemVO();
        historyItemVO.setLessonId(historyItemDO.getLessonId());
        historyItemVO.setUserEmail(historyItemDO.getUserEmail());
        historyItemVO.setGmtTimestamp(historyItemDO.getGmtTimestamp());
        historyItemVO.setId(historyItemDO.getId());
        return historyItemVO;
    }
}

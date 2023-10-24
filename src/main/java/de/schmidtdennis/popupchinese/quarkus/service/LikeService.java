package de.schmidtdennis.popupchinese.quarkus.service;

import de.schmidtdennis.popupchinese.quarkus.converter.LikeConverter;
import de.schmidtdennis.popupchinese.quarkus.model.dataobject.LikeDO;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.LikeVO;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class LikeService {

    @Inject
    private LikeConverter likeConverter;

    @Transactional
    public LikeVO add(String userEmail, Long lessonId){
        LikeDO newLike = new LikeDO();
        newLike.setUserEmail(userEmail);
        newLike.setLessonId(lessonId);
        newLike.setGmtTimestamp(System.currentTimeMillis());
        newLike.persist();
        return likeConverter.toVO(newLike);
    }

    public List<LikeVO> getAll(String userEmail) {
        List<LikeDO> likesDO = LikeDO.find("userEmail", Sort.descending("gmtTimestamp"), userEmail).list();

        return likesDO.stream()
                .map(likeDO -> likeConverter.toVO(likeDO))
                .collect(Collectors.toList());
    }
}

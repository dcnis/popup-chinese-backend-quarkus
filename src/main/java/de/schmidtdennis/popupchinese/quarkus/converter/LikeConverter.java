package de.schmidtdennis.popupchinese.quarkus.converter;

import de.schmidtdennis.popupchinese.quarkus.model.dataobject.LikeDO;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.LikeVO;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LikeConverter {

    public LikeVO toVO(LikeDO likeDO) {
        LikeVO likeVO = new LikeVO();
        likeVO.setLessonId(likeDO.getLessonId());
        likeVO.setUserEmail(likeDO.getUserEmail());
        likeVO.setGmtTimestamp(likeDO.getGmtTimestamp());
        likeVO.setId(likeDO.getId());
        return likeVO;
    }
}

package de.schmidtdennis.popupchinese.quarkus.converter;

import de.schmidtdennis.popupchinese.quarkus.model.dataobject.VocabularyDO;
import de.schmidtdennis.popupchinese.quarkus.model.request.VocabularyAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.VocabularyVO;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VocabularyConverter {

    public VocabularyDO toDO(VocabularyAddReq vocabulary) {
        VocabularyDO newVocabulary = new VocabularyDO();
        newVocabulary.setLessonId(vocabulary.getLessonId());
        newVocabulary.setChinese(vocabulary.getChinese());
        newVocabulary.setPinyin(vocabulary.getPinyin());
        newVocabulary.setEnglish(vocabulary.getEnglish());
        newVocabulary.setCategory(vocabulary.getCategory());
        newVocabulary.setVocabularyOrder(vocabulary.getVocabularyOrder());

        return newVocabulary;
    }

    public VocabularyVO toVO(VocabularyDO vocabularyDO) {
        VocabularyVO vocabularyVO = new VocabularyVO();

        vocabularyVO.setId(vocabularyDO.getId());
        vocabularyVO.setLessonId(vocabularyDO.getLessonId());
        vocabularyVO.setChinese(vocabularyDO.getChinese());
        vocabularyVO.setPinyin(vocabularyDO.getPinyin());
        vocabularyVO.setEnglish(vocabularyDO.getEnglish());
        vocabularyVO.setCategory(vocabularyDO.getCategory());
        vocabularyVO.setVocabularyOrder(vocabularyDO.getVocabularyOrder());

        return vocabularyVO;
    }
}

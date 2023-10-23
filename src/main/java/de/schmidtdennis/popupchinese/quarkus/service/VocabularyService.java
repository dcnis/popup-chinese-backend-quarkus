package de.schmidtdennis.popupchinese.quarkus.service;

import de.schmidtdennis.popupchinese.quarkus.converter.VocabularyConverter;
import de.schmidtdennis.popupchinese.quarkus.model.dataobject.VocabularyDO;
import de.schmidtdennis.popupchinese.quarkus.model.request.VocabularyAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.VocabularyVO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class VocabularyService {

    @Inject
    private VocabularyConverter vocabularyConverter;

    @Transactional
    public VocabularyVO add(VocabularyAddReq vocabulary){
        VocabularyDO vocabularyDO = vocabularyConverter.toDO(vocabulary);
        vocabularyDO.persist();
        return vocabularyConverter.toVO(vocabularyDO);
    }

    public VocabularyVO getById(Integer id){
        VocabularyDO vocabularyDO = VocabularyDO.findById(id);

        if(vocabularyDO == null){
            throw new NotFoundException();
        }

        return vocabularyConverter.toVO(vocabularyDO);
    }

    public List<VocabularyVO> getAll(){
        List<VocabularyDO> vocabularyDOs = VocabularyDO.listAll();
        return vocabularyDOs.stream()
                .map(vocabularyDO -> vocabularyConverter.toVO(vocabularyDO))
                .collect(Collectors.toList());
    }

    @Transactional
    public boolean delete(Integer id) {
        return VocabularyDO.deleteById(id);
    }

    public List<VocabularyVO> getByLessonId(Long lessonId) {
        List<VocabularyDO> vocabularyDOs = VocabularyDO.list("lessonId", lessonId);

        return vocabularyDOs.stream()
                .map(vocabularyDO -> vocabularyConverter.toVO(vocabularyDO))
                .collect(Collectors.toList());
    }
}

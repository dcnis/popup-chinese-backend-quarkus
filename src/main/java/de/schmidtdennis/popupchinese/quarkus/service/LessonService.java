package de.schmidtdennis.popupchinese.quarkus.service;

import de.schmidtdennis.popupchinese.quarkus.converter.LessonConverter;
import de.schmidtdennis.popupchinese.quarkus.model.db.LessonDO;
import de.schmidtdennis.popupchinese.quarkus.model.request.LessonReq;
import de.schmidtdennis.popupchinese.quarkus.model.vo.LessonVO;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class LessonService {

    @Inject
    private LessonConverter lessonConverter;

    @Transactional
    public LessonVO add(LessonReq lesson){
        LessonDO lessonDO = lessonConverter.toDO(lesson);
        lessonDO.persist();
        return lessonConverter.toVO(lessonDO);
    }

    public LessonVO getById(Integer id){
        LessonDO lessonDO = LessonDO.findById(id);

        if(lessonDO == null){
            throw new NotFoundException();
        }

        return lessonConverter.toVO(lessonDO);
    }

    public List<LessonVO> getAll(){
        List<LessonDO> lessonDOs = LessonDO.listAll();
        return lessonDOs.stream()
                .map(lessonDO -> lessonConverter.toVO(lessonDO))
                .collect(Collectors.toList());
    }

    @Transactional
    public boolean delete(Integer id) {
        return LessonDO.deleteById(id);
    }
}

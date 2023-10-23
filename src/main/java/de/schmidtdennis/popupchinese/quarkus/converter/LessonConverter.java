package de.schmidtdennis.popupchinese.quarkus.converter;

import de.schmidtdennis.popupchinese.quarkus.model.db.LessonDO;
import de.schmidtdennis.popupchinese.quarkus.model.request.LessonReq;
import de.schmidtdennis.popupchinese.quarkus.model.vo.LessonVO;
import jakarta.enterprise.context.ApplicationScoped;
import org.apache.commons.beanutils.BeanUtils;
import org.jboss.logging.Logger;


@ApplicationScoped
public class LessonConverter {

    private static final Logger log = Logger.getLogger(LessonConverter.class);

    public LessonDO toDO(LessonReq lesson){
        LessonDO newLesson = new LessonDO();
        newLesson.setTitle(lesson.getTitle());
        return newLesson;
    }

    public LessonVO toVO(LessonDO lessonDO) {
        LessonVO lessonVO = new LessonVO();
        try {
            BeanUtils.copyProperties(lessonVO, lessonDO);
            // set other fields if needed
        } catch (Exception e) {
            log.error("Error trying to copy bean properties");
            return null;
        }

        return lessonVO;
    }
}

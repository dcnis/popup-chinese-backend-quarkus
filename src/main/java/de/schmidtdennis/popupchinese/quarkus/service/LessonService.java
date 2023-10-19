package de.schmidtdennis.popupchinese.quarkus.service;

import de.schmidtdennis.popupchinese.quarkus.model.Lesson;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class LessonService {

    @Transactional
    public String create(String lessonName){
        Lesson lesson = new Lesson();
        lesson.setName(lessonName);
        lesson.persist();
        return "Lesson " + lessonName + " was created";
    }

    public Lesson get(String lessonName){
        return Lesson.find("name", lessonName).firstResult();
    }

    public List<Lesson> getAll(){
        return Lesson.listAll();
    }

}

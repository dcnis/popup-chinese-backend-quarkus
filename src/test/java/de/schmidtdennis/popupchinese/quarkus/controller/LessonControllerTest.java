package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.model.request.LessonReq;
import de.schmidtdennis.popupchinese.quarkus.model.vo.LessonVO;
import de.schmidtdennis.popupchinese.quarkus.service.LessonService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;

@MockitoSettings
class LessonControllerTest {

    @Mock
    private LessonService lessonService;

    @InjectMocks
    private LessonController testee;

    @Test
    public void testAdd(){
        // GIVEN
        LessonReq req = new LessonReq();
        req.setTitle("First Lesson");

        // WHEN
        LessonVO lessonVO = testee.add(req);

        // THEN
        Mockito.verify(lessonService).add(req);

    }

}

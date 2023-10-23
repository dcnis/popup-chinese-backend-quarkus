package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.model.request.LessonAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.LessonVO;
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
        LessonAddReq req = new LessonAddReq();
        req.setTitle("First Lesson");

        // WHEN
        LessonVO lessonVO = testee.add(req);

        // THEN
        Mockito.verify(lessonService).add(req);

    }

}

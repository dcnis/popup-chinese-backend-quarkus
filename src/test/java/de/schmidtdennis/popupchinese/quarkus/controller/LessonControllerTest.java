package de.schmidtdennis.popupchinese.quarkus.controller;

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
    public void test(){
        // GIVEN

        // WHEN
        String result = testee.hello("Dennis");

        // THEN
        Mockito.verify(lessonService).greeting("Dennis");

    }

}

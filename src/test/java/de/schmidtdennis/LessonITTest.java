package de.schmidtdennis;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class LessonITTest {

    @Test
    public void testCreateLessonEndpoint() {
        given()
          .when().post("/lesson/create?name=one")
          .then()
             .statusCode(200)
             .body(is("Lesson one was created"));
    }

}

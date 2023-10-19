package de.schmidtdennis;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().post("/hello?name=Dennis")
          .then()
             .statusCode(200)
             .body(is("Welcome to my app Dennis"));
    }

}

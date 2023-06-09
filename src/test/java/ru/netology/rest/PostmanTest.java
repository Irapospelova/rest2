package ru.netology.rest;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class PostmanTest {
    @Test
            void shouldReturnCorrectData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Today's the Victory Day") // отправляемые данные (заголовки и query можно выставлять аналогично)

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Today's the Victory Day"))
        ;
    }

}

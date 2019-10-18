package nl.abnamro.demo.RecipeSystem;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;



public class GetScenarioTest {

    @Test
    public void get_checkStatusCode_expectHttp200() {

        given().
                when().
                get("http://localhost:8080/recipes").
                then().
                assertThat().
                statusCode(200);
    }

    @Test
    public void get_checkResponseType() {

        given().
                when().
                get("http://localhost:8080/recipes").
                then().
                assertThat().
                contentType("application/json");
    }
    }





















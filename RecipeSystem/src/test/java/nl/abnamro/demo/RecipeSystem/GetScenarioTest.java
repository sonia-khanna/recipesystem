package nl.abnamro.demo.RecipeSystem;
;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static com.jayway.restassured.RestAssured.given;
public class GetScenarioTest {
    private String url;
    com.jayway.restassured.response.Response response;

    @Given("^ReciepeSystem is up \"([^\"]*)\"$")
    public void apiRunning(String url){
        this.url = url;
    }

    @When("^a user performs a get request to \\\"([^\\\"]*)\\\"$")
    public void userGetRequest(String addurl){

        this.url = this.url + addurl;
    }


    @Then("^the response code is 200$")
    public void userGetResponse(){

        response = given().when().get(this.url);
        org.junit.Assert.assertEquals(200, response.statusCode());
    }
}














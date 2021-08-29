package ItemForLastQuestions;

import ItemForLastQuestions.ResponseItem;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeserializationLastQuestion {
    @Test
    public void deserialization(){
        Response response = given()
                .when()
                .get("http://jsonplaceholder.typicode.com/users");

    }
}

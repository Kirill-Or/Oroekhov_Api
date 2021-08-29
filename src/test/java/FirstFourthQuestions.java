import ResponseForTests.GameResponseItem;
import ResponseForTests.ResponceWithFields;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class FirstFourthQuestions {
@Test
    public void getAllGames() {

        Response response = given().header("Accept", "application/json")
                .when().get("http://localhost:8080/app/videogames");
    response.then()
                .assertThat().statusCode(200)
                .assertThat().contentType(ContentType.JSON)
                .time(lessThan(1000L))
                .log().all();

    }
    @Test
    public void addNewGames(){
    GameResponseItem gameResponseItem = new GameResponseItem(80, "2021-08-29T18:25:55.351Z", "CyberPunk",
            "PG-13", 16, "Shooter");

    given()
                .header("Content-Type", "application/json")
              //  .header("Accept", "application/xml", "-d")
                .body(gameResponseItem)
                .when()
                .post("http://localhost:8080/app/videogames")
                .then().assertThat().statusCode(HttpStatus.SC_OK)
                .log().body();
}
    @Test
public void GetOneGame(){

            int gameId = 2;

            Response response = given().header("Accept", "application/json")
                    .when()
                    .get("http://localhost:8080/app/videogames/" + gameId);

            ResponceWithFields responceWithFields = response.as(ResponceWithFields.class);
            System.out.println("id is " + responceWithFields.getId() + " name is " + responceWithFields.getName() );

        }
    @Test
    public void UpdateGame(){
        int gameId = 2;

        Response response = given().header("Accept", "application/json")
                .when()
                .get("http://localhost:8080/app/videogames/" + gameId);
        ResponceWithFields responceWithFields = response.as(ResponceWithFields.class);
        responceWithFields.setName("Detroit");
        responceWithFields.setCategory("Interactive Movie");

        given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(responceWithFields)
                .when()
                .put("http://localhost:8080/app/videogames/" + gameId)
                .then().assertThat().statusCode(HttpStatus.SC_OK)
                .time(lessThan(1000L))
                .log().body();
    }
}


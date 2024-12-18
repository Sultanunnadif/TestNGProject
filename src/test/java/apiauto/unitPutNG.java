import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.regex.Matcher;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class unitPutNG {
    @BeforeMethod
    public void original() {
        RestAssured.baseURI = "https://reqres.in/api/users/2";
    }

    @Test
    public void putTest() {
        int id = 2;
        Response outdateData = given().when().get("https://reqres.in/api/users/2");
        String FName = outdateData.jsonPath().getString("data.first_name");
        String LName = outdateData.jsonPath().getString("data.last_name");
        String email = outdateData.jsonPath().getString("data.email");
        String avatar = outdateData.jsonPath().getString("data.avatar");
        System.out.println("Outdated First Name: " + FName);
        System.out.println("Outdated Last Name: " + LName);
        System.out.println("Outdated Email" + email);

        // Update Data
        String newFirstName = "Sultanun";
        String newLastName = "Nadif";
        String newEmail = "Sultanunnadif@gmail.com";

        // JSON PUT request
        JSONObject newData = new JSONObject();
        newData.put("first_name", newFirstName);
        newData.put("last_name", newLastName);
        newData.put("email", newEmail);
        newData.put("avatar", avatar);

        //result Update
        given().log().all()
                .header("Content-Type","Application/json")
                .body(newData.toString())
                .put("https://reqres.in/api/users/2"+id)
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("first_name", Matchers.equalTo(newFirstName));

    }
}

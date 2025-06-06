package apiauto;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import netscape.javascript.JSObject;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;

public class testReqres {

    @Test
    public void theGetListUsers(){
        File jsonSchema = new File("src/test/resources/jsonSchema/getuserlistSchema.json");
        RestAssured
                .given().when()
                .get("https://reqres.in/api/users?page=2")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("per_page", Matchers.equalTo(6))
                .assertThat().body("page", Matchers.equalTo(2))
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
    @Test
    public void testPostCreateUser(){
        String valueName = "Sultanunnadif";
        String valueJob = "Quality Assurance";

        JSONObject bodyObject = new JSONObject();
        bodyObject.put("name",valueName);
        bodyObject.put("job",valueJob);

        RestAssured.given()
                .header("Content-Type","application/json")
                .header("Accept","application/json")
                .body(bodyObject.toString())
                .when()
                .post("https://reqres.in/api/users")
                .then().log().all()
                .assertThat().statusCode(201)
                .assertThat().body("name", Matchers.equalTo(valueName));
    }
}

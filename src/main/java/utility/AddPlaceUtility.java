package utility;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class AddPlaceUtility {
    public static Response getPlaceRestCall(){
        return given().
                queryParam("key", "qaclick123").
                queryParam("place_id", "34a61f4b70dd1b24f6b73de721d265b6").
                when().
                get("https://rahulshettyacademy.com/maps/api/place/get/json").
                then().
                statusCode(200).extract().response();
    }
}

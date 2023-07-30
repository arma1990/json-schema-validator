package utility;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class GetPlaylistUtility {
    public static Response getPlaylistRestCall(){
        return given().
                header("Authorization", "Bearer BQB6w1ysCzxiaYYn_o_WWOz3ESaMOvcs4qoKHzkSw7PMIcuauzQCb8Adz3O_DXt6ez3hQ4Gp0fPtBd1Mie2jN9q1ZnzD4dixXS9-n5H8ycJofqa7EBfDyqX1Rf50apAIAgLPUq9Hi9sD8bjms8sJbd_lw9IrpTsTJH5b4VL2hSwIJpriOH5tZAX4ZklK-qtUWUIzl7i0nwfcyGItws8XblhfbJbYWZwZFJ-gOtM7C5D8P-FPuy02RE91joTOziXM0ISWvLxTlUY5").
                when().
                get("https://api.spotify.com/v1/playlists/2WJXM3Wbse7SERKPYeCLZL").
                then().
                statusCode(200).extract().response();
    }
}

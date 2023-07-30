package testcases;

import model.GetPlaylistResponse;
import org.testng.annotations.Test;
import static helpers.SchemaGenerator.generateSchema;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static utility.GetPlaylistUtility.getPlaylistRestCall;

public class APITest {
    @Test
    public void getPlaylistTest() {
        final var schemaString = generateSchema(GetPlaylistResponse.class);
        try {
            final var response = getPlaylistRestCall();
            response.then().assertThat().body(matchesJsonSchema(schemaString));
            System.out.println("Schema validation succeeded.");
        } catch (AssertionError e) {
            throw new RuntimeException("Schema Validation Failed with Error(s): " + e.getMessage());
        }
    }
}

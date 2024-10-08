package api;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UnicornApiRequests {
    public String unicornId;

    public void createUnicornAndGetId(String baseUrl, String body) {
        RestAssured.filters(new RequestLoggingFilter(), new RequestLoggingFilter());

        Response response = given()
                .baseUri(baseUrl)
                .contentType(ContentType.JSON)
                .body(body)
                .post();

            unicornId = response.jsonPath().getString("_id");
            System.out.println("Unicorn created with ID: " + unicornId);
    }

    public Response updateUnicornName(String baseUrl, String newName) {
        if (unicornId == null || unicornId.isEmpty()) {
            throw new IllegalStateException("Unicorn ID is null or empty. Create a unicorn first.");
        }

        return given()
                .baseUri(baseUrl)
                .contentType(ContentType.JSON)
                .body("{ \"name\": \"" + newName + "\" }")
                .put("/" + unicornId);
    }

    public Response updateUnicornColor(String baseUrl, String newColor) {
        if (unicornId == null || unicornId.isEmpty()) {
            throw new IllegalStateException("Unicorn ID is null or empty. Create a unicorn first.");
        }

        return given()
                .baseUri(baseUrl)
                .contentType(ContentType.JSON)
                .body("{ \"color\": \"" + newColor + "\" }")
                .put("/" + unicornId);
    }

    public void deleteUnicorn(String baseUrl) {
        if (unicornId == null || unicornId.isEmpty()) {
            throw new IllegalStateException("Unicorn ID is null or empty. Create a unicorn first.");
        }

        given()
                .baseUri(baseUrl)
                .contentType(ContentType.JSON)
                .delete("/" + unicornId)
                .then()
                .statusCode(200);
    }

    public void deleteAllUnicorns(String baseUrl) {
        given()
                .baseUri(baseUrl)
                .contentType(ContentType.JSON)
                .delete("/")
                .then()
                .statusCode(200);
    }

    public Response getUnicorn(String baseUrl) {
        return given()
                .baseUri(baseUrl)
                .contentType(ContentType.JSON)
                .get("/" + unicornId)
                .then()
                .extract()
                .response();
    }
}

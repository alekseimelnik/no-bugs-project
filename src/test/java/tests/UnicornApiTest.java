package tests;

import api.UnicornApiRequests;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnicornApiTest {
    public static String baseUrl = "https://crudcrud.com/api/b3d617f11b384f20af99c7c28d3d62f9/unicorn";
    static UnicornApiRequests api = new UnicornApiRequests();

    @BeforeAll
    static void beforeAll() {
        RestAssured.filters(new RequestLoggingFilter(), new RequestLoggingFilter());
        String unicornName = "Rainbow Dash";
        String unicornColor = "blue";
        api.createUnicornAndGetId(baseUrl,
                "{ \"name\": \"" + unicornName + "\", \"color\": \"" + unicornColor + "\" }");
    }

    @AfterAll
    static void afterAll() {
        api.deleteUnicorn(baseUrl);
    }

    @Test
    void statusCodeIs200Ok() {
        Response response = api.getUnicorn(baseUrl);
        assertEquals(200, response.getStatusCode());
    }

    @Test
    void theUnicornColorIsUpdated() {
        String newColor = "yellow";

        Response response = api.updateUnicornColor(baseUrl, newColor);

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void checkTheIdIsNotNullOrEmpty() {
        assertTrue(api.unicornId != null && !api.unicornId.isEmpty());
    }

}

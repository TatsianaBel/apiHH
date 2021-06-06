package adapter;

import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.Map;

import static io.restassured.RestAssured.given;

public class BaseAdapter {
    private static final Logger logger = LogManager.getLogger(BaseAdapter.class);
    private static final String BASE_URL = "https://api.hh.ru/";

    protected RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri(BASE_URL)
            .setContentType(ContentType.JSON)
            .addFilter(new AllureRestAssured())
            .build()
            .log().all();


    @Step ("GET запрос без query и path параметров")
    public Response get(String url) {
        logger.info("START to send GET request без query и path параметров");
        return given()
                .spec(requestSpec)
                .when()
                .get(url);
    }

    @Step ("GET запрос с query параметрами")
    public Response get(String url, Map<String, Object> map) {
        logger.info("START to send GET request с query параметрами");
        return given()
                .spec(requestSpec).queryParams(map)
                .when()
                .get(url);
    }

    @Step ("GET запрос с path параметром {pathParam}")
    public Response get(String url, String pathParam, String dataParam) {
        logger.info("START to send GET request с path параметром {pathParam}",pathParam);
        return given()
                .spec(requestSpec)
                .basePath(url)
                .pathParam(pathParam, dataParam)
                .when()
                .get(String.format("/{%s}",pathParam));
    }
}

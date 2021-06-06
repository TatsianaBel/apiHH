package utils;

import adapter.BaseAdapter;
import io.qameta.allure.Step;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UtilsValidation {
    private static final Logger logger = LogManager.getLogger(BaseAdapter.class);
    @Step ("Валидация JSON schema")
    public void validatedJSONSchema(Response response, String filePath){
        logger.info("START валидации JSON схемы на соответствие схеме {filePath}",filePath);
        response.then().assertThat().
                body(JsonSchemaValidator.matchesJsonSchemaInClasspath(filePath));
        logger.info("FINISH валидации успешно");

    }

}

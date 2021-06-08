package tests;

import adapter.BaseAdapter;
import constants.EndPoints;
import constants.Status;
import io.restassured.response.Response;
import model.Vacancy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.UtilsValidation;


public class FindVacancyByIdTest {
    BaseAdapter baseAdapter = new BaseAdapter();
    UtilsValidation utilsValidation = new UtilsValidation();

    @DataProvider(name = "valid-data-id")
    public Object[][] dataProviderMethodValidId() {
        return new Object[][]{
                {"44757578"}
        };
    }

    @Test(dataProvider = "valid-data-id")
    public void getVacancyByValidIdTest(String id) {
        Response response = baseAdapter.get(EndPoints.VACANCIES, "id", id);
        utilsValidation.validatedJSONSchema(response, "VacancySchema.json");
        Vacancy fgdfg = response.then().
                log().all().
                statusCode(Status.OK).
                extract().as(Vacancy.class);
        Assert.assertEquals(fgdfg.getId(), id);
    }


    @DataProvider(name = "invalid-data-id")
    public Object[][] dataProviderMethodInvalidId() {
        return new Object[][]{
                {"4541164414"},
                {"data two"}
        };
    }

    @Test(dataProvider = "invalid-data-id")
    public void getVacancyByIdBadRequestTest(String id) {
        Response response = baseAdapter.get(EndPoints.VACANCIES, "id", id);
        utilsValidation.validatedJSONSchema(response, "ResponseNotFound.json");
        response.then().
                log().all().
                statusCode(Status.NOT_FOUND);
    }
}

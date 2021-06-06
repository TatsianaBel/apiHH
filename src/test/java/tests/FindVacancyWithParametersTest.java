package tests;

import adapter.BaseAdapter;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.UtilsMethods;
import utils.UtilsValidation;

import java.io.IOException;
import java.util.Map;


public class FindVacancyWithParametersTest {

    UtilsValidation utilsValidation = new UtilsValidation();
    @DataProvider(name = "data")
    public Object[][] dataSupplier() throws IOException {
        UtilsMethods utils = new UtilsMethods();
        return utils.readXLS("src/test/resources/dataFind.xlsx");
    }

    @Test(dataProvider = "data")
    public void findVacancy(Map<String, Object> map) {
        BaseAdapter baseAdapter = new BaseAdapter();
        Response response = baseAdapter.get("vacancies", map);
        utilsValidation.validatedJSONSchema(response, "VacancyArray.json");
    }
}

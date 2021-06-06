package drafttests;

import adapter.BaseAdapter;
import constants.EndPoints;
import constants.Status;
import org.testng.annotations.Test;

public class PingTest {

    BaseAdapter baseAdapter = new BaseAdapter();

    @Test
    public void pingTest() {
         baseAdapter.get(EndPoints.VACANCIES)
                .then()
                .statusCode(Status.OK);
    }

    @Test
    public void favoritedVacancyTest() {
        baseAdapter.get("vacancies/favorited")
                .then()
                .statusCode(Status.FORBIDDEN);
    }

}

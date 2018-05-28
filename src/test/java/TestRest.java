import static com.jayway.restassured.RestAssured.get;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.json.JSONArray;




public class TestRest {

    @Test
    public void makeSureThatGoogleIsUp() {
        Response response = get("http://restcountries.eu/rest/v1/name/ukraine");
        JSONArray jsonResponse = new JSONArray(response.asString());
        String capital = jsonResponse.getJSONObject(0).getString("capital");
        Assert.assertEquals(capital, "Kiev");

    }

}

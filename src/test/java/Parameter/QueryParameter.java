package Parameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameter 
{
	@Test
	public void queryParam()
	{
        given().queryParam("page",2)
		
		.when().get("https://reqres.in/api/users")
		.then().assertThat().statusCode(200).log().all();
	}

}

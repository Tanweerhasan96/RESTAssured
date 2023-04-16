package cookiesAndHeader;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Logging 
{
	@Test
	public void logg()
	{
		
		Response resp = given()
		.when().get("https://www.google.com/");
		
		resp.then().log()
		          //.body();
		          // .cookies();
		          // .headers();
		         // .everything();
		           .all();
	}

}

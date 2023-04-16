package authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Auth_2 
{
	@Test
	public void generateToken()
	{
		Response resp = given()
		.formParam("client_id","DompaChompa")
		.formParam("client_secret","1649b6db4bd12b1e427647558d3738aa")
		.formParam("grant_type","client_credentials")
		.formParam("redirect_uri", "http://tanweer.com")
		.formParam("code", "authorization_code only")
		
		.when().post("http://coop.apps.symfonycasts.com/token");
		
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		given().auth().oauth2(token)
		.pathParam("User_Id", 4372 )
		
		.when().post("http://coop.apps.symfonycasts.com/api/{User_Id}/eggs-collect")
		.then().log().all();
	}

}

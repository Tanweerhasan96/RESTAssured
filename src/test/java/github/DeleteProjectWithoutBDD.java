package github;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DeleteProjectWithoutBDD 
{
	@Test
	public void delete()
	{
		baseURI="https://api.github.com";
		//String pro="Maahi85";
		String token="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";
		
		
		RestAssured.given().auth().oauth2("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");
		Response resp = RestAssured.delete("/repos/Tanweerhasan96/Maahi85");
		
		//validate
		resp.then().log().all();
		int sc = resp.getStatusCode();
		System.out.println(sc);
		Assert.assertEquals( 204,sc);
		
		
		
	}

}

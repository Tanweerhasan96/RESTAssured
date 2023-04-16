package github;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectWithBDD 
{
	@Test
	public void update()
	{
		String pro="Maahi409";
		baseURI="https://api.github.com";
		String token="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";
		JSONObject jobj=new JSONObject();
	    jobj.put("designation","Devops");
	    jobj.put("homepage","logout");
		given().pathParam("pId","Maahi409" )
		 .body(jobj)
		 .contentType(ContentType.JSON)
		 .auth().oauth2(token)
		
		.when().patch("/repos/Tanweerhasan96/{pId}")
		.then().assertThat().statusCode(200).contentType("application/json").log().all();
		
		
		
	}

}

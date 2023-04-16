package Parameter;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateProject_For_Parameter 
{
	@Test
	public void createProject()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		JSONObject json = new JSONObject();
		json.put("createdBy","Tanweer1");
		json.put("projectName","Amazon96");
		json.put("status","Created");
		json.put("teamsize","10");
		
		
		given().body(json).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).log().all();
		
	}

}

package crud_Operation_WithoutBDD;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectWithoutBDD 
{
	

	@Test
	public void updateProject() {
		JSONObject json= new JSONObject();
		json.put("createdBy", "Tanweer");
		json.put("projectName", "Amazing");
		json.put("status", "Created");
		json.put("teamSize", 12);
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(json);
		
		Response resp = req.put("http://rmgtestingserver:8084/projects/TY_PROJ_18835");
		String completebody = resp.prettyPrint();
		System.out.println(completebody);
		
		int actSC = resp.getStatusCode();
		Assert.assertEquals(200, actSC);
		
		String actCT = resp.getContentType();
		System.out.println(actCT);
		Assert.assertEquals("application/json", actCT);
		
		 

		
 



}

	
	}

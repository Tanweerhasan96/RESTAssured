package crud_Operation_WithoutBDD;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectWithoutBDD 
{
	@Test
	public void createProject()
	{
		JSONObject json = new JSONObject();
		json.put("createdBy","Tanweer1");
		json.put("projectName","Amazon6334");
		json.put("status","Created");
		json.put("teamsize","10");
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(json);
		
		Response resp = req.post("http://rmgtestingserver:8084/addProject");
		String completebody = resp.prettyPrint();
		System.out.println(completebody);
		
		int actSC = resp.getStatusCode();
		Assert.assertEquals(201, actSC);
		String actCT = resp.getContentType();
		Assert.assertEquals("application/json", actCT);
	}

}

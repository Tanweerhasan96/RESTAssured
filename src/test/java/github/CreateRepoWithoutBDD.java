package github;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_Package.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateRepoWithoutBDD
{
	@Test
	public void create()
	{
		//pre requisite -->request body
		JavaUtility j=new JavaUtility();
		baseURI="https://api.github.com";
		JSONObject jobj=new JSONObject();
	    jobj.put("name","Maahi"+j.getRandomNo());
	    jobj.put("designation","QA");
	    jobj.put("homepage","login");
	    
	    
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		req.auth().oauth2("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");
		
		//perform action
		Response resp = req.post("/user/repos");
		
		String cbody = resp.prettyPrint();
		System.out.println(cbody);
		Response peek = resp.prettyPeek();
		String st = resp.asString();
		System.out.println(st);
		
		//provide validation
		
		int status = resp.getStatusCode();
		System.out.println(status);
		Assert.assertEquals(201, status);
		
		String ct = resp.getContentType();
		System.out.println(ct);
		Assert.assertEquals("application/json; charset=utf-8", ct);
//		long time = resp.getTime();
//		Assert.assertEquals(2860, time);
	}

}

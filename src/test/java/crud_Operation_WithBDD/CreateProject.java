package crud_Operation_WithBDD;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic_Package.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class CreateProject 
{
	@Test
	public void create()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		JavaUtility j=new JavaUtility();
	
	    JSONObject json = new JSONObject();
	    json.put("createdBy","Tanweer1");
	    json.put("projectName","Amazon"+j.getRandomNo());
	    json.put("status","Created");
	    json.put("teamsize","10");
	
	    given().body(json).contentType(ContentType.JSON)
	    
	    .when().post("/addProject")
	    
	   // .then().assertThat().contentType(ContentType.JSON).statusCode(201).log().all();
	   
	    .then().assertThat().time(Matchers.lessThan(50L),TimeUnit.SECONDS).log().all();
		
		
	}
}



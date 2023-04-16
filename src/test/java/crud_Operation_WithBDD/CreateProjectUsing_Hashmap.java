package crud_Operation_WithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic_Package.JavaUtility;
import io.restassured.http.ContentType;

public class CreateProjectUsing_Hashmap 
{
	@Test
	public void create()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		JavaUtility j=new JavaUtility();
	
	   HashMap<String, Object> json = new HashMap<String, Object>();
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

package three_Layer_Testing;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Fetch_ProId_with_BDD
{
	@Test
	public void create()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		Create_Project_Using_GUI c=new Create_Project_Using_GUI();
		   given().pathParam(Create_Project_Using_GUI.porId, c)
	   
	      .when().post("/addProject")
	    
	   // .then().assertThat().contentType(ContentType.JSON).statusCode(201).log().all();
	   
	      .then().assertThat().time(Matchers.lessThan(50L),TimeUnit.SECONDS).log().all();
		
		
	}

}

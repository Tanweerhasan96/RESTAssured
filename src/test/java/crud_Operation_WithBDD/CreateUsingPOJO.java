package crud_Operation_WithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojo_class.CreatedProject;

public class CreateUsingPOJO 
{
	
	@Test
	public void create()
	{
		baseURI="http://rmgtestingserver:8084";
		CreatedProject cP=new CreatedProject("MahiBhai","xyzzz","onGoing",5);
		
		given()
		.body(cP).contentType(ContentType.JSON)
		
		.when().post("/addProject")
		
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}

}

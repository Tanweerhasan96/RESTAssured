package Parameter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter
{
	@Test
	public void pathParametr()
	{
		//String projectId=TY_PROJ_19260
		//pre requisite
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().pathParam("pId","TY_PROJ_19260")
		//actions
	    .when().get("/projects/{pId}")
	    //validation
	    .then().statusCode(200).log().all();
}

}

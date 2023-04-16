package crud_Operation_WithBDD;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic_Package.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class UpdateProject 
{
	@Test
	public void update()
	{

		baseURI="http://rmgtestingserver";
		port=8084;
		
		JSONObject json=new JSONObject();
		json.put("projectName","Flipkart");
		json.put("createdBy","TanweerBuddy");
		json.put("teamSize",12);
		json.put("status","on-Going");
		
		given().contentType(ContentType.JSON).body(json)
		
		.when().put("/projects/TY_PROJ_19005")
		
		//.then().assertThat().contentType(ContentType.JSON).statusCode(200).log().all();
		.then().assertThat().contentType(ContentType.JSON).statusCode(200).time(Matchers.lessThan(50L),TimeUnit.SECONDS).log().all();
	}

}

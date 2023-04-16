package github;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class CreateRepoWithBDD 
{
	@Test
	public void create()
	{
		File file=new File("./BDD.json");
		baseURI="https://api.github.com";
		
		given()
	    	.body(file)
		    .contentType(ContentType.JSON)
		    .auth().oauth2("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")
		
		.when().post("/user/repos")
		
		.then().assertThat().statusCode(201).time(Matchers.lessThan(50L),TimeUnit.SECONDS).log().all();
		
	
		
		
	}

}

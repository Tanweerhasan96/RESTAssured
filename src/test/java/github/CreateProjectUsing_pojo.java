package github;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import generic_Package.JavaUtility;
import github_Pojo.GithubPojo;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class CreateProjectUsing_pojo 
{
	@Test
	public void create()
	{
		baseURI="https://api.github.com";
		String token="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";
		
		JavaUtility j=new JavaUtility();
		GithubPojo gpo=new GithubPojo("Tanweer"+j.getRandomNo(),"Devops", "Login");
		
		given()
		  .body(gpo)
		  .contentType(ContentType.JSON)
		  .auth().oauth2("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")
		
		.when().post("/user/repos")
		
		.then().assertThat().statusCode(201).contentType("application/json; charset=utf-8")
		.time(Matchers.lessThan(50L),TimeUnit.SECONDS).log().all();
	}

}

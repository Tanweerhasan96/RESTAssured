package github;

import org.testng.annotations.Test;

import generic_Package.JavaUtility;
import github_Pojo.GithubPojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class RequestChaining 
{
	@Test
	public void requests() 
	{
		baseURI="https://api.github.com";
		String token="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";
		JavaUtility j=new JavaUtility();
		GithubPojo git=new GithubPojo("Tanweer"+j.getRandomNo(),"Automation Tester", "Bangalore");
  
		 Response resp = given().body(git).contentType(ContentType.JSON).auth().oauth2("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")
		  .when().post("/user/repos");
		 
		 String nameId = resp.jsonPath().get("name");
		 System.out.println(nameId);
		 resp.then().statusCode(201).log().all();
		 
		 given().pathParam("nameID", nameId)
		 .when().get("/repos/Tanweerhasan96/{nameID}")
		 .then().assertThat().statusCode(200).log().all();
		 
		
		 
	}

}

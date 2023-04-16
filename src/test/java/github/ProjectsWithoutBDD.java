package github;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ProjectsWithoutBDD 
{
	@Test
	public void getAllProjects()
	{
		baseURI="https://api.github.com";
		Response resp = RestAssured.get("/users/Tanweerhasan96/repos");
		String completeBody = resp.prettyPrint();
		System.out.println(completeBody);
		
		int sc = resp.getStatusCode();
		System.out.println(sc);
		Assert.assertEquals(200, sc);
		String cont = resp.getContentType();
		System.out.println(cont);
		Assert.assertEquals("application/json; charset=utf-8", cont);
		
	}

}

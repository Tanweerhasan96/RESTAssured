package github;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ProjectsGithubWithBDD
{
	@Test
	public void getAllProjects()
	{
		baseURI="https://api.github.com";
		 when().get("/users/Tanweerhasan96/repos")
		 
			   .then().statusCode(200).log().all();
	
		
	}

}

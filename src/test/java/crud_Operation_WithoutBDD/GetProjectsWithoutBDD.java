package crud_Operation_WithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetProjectsWithoutBDD 
{
	@Test
	public void getAllProjects()
	{
		Response resp = RestAssured.get("http://rmgtestingserver:8084/projects");
		 String  completeBody = resp.prettyPrint();
		 System.out.println(completeBody);
		 
		 int actSC = resp.getStatusCode();
	     System.out.println(actSC);
		  
		  String actCT = resp.getContentType();
		  System.out.println(actCT);
	}

}

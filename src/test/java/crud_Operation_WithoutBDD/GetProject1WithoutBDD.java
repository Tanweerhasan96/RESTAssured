package crud_Operation_WithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetProject1WithoutBDD 
{
	@Test
	public void getAllProjects()
	{
         Response resp = RestAssured.get("http://rmgtestingserver:8084/projects/TY_PROJ_18835");
		 String  completeBody = resp.prettyPrint();
		 System.out.println(completeBody);
		 
		 int actSC = resp.getStatusCode();
	      System.out.println(actSC);
		  
		  String actCT = resp.getContentType();
		  System.out.println(actCT);
		  
	}
 


	}


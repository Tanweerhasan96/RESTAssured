package crud_Operation_WithoutBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjectWithoutBDD 
{
	@Test
	public void deleteProject()
	{
		Response req = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_18835");
	
	    int actSC = req.getStatusCode();
		Assert.assertEquals(204, actSC);
		
		String actCT = req.getContentType();
		System.out.println(actCT);
		Assert.assertEquals("application/json", actCT);
	}

}

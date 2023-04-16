package validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseValidation 
{
	@Test
	public void dynamicValidation()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		String expData="TY_PROJ_9950";
		String proid=null;
		
		Response resp = when().get("/projects");
		
	
				boolean flag = false;
				List<String> pIDs = resp.jsonPath().get("projectId");
				for(String projectID : pIDs)
				{
					if(projectID.equalsIgnoreCase(expData))
					{
						proid=projectID;
						flag = true;
					}
				}
				
				Assert.assertTrue(flag);
				System.out.println("data verfied");
			    resp.then().assertThat().statusCode(200);
			    
			    System.out.println("----------------------------------------");
			    
			    given().pathParam("pid",proid)
			    .when().get("/projects/{pid}")
			    .then().statusCode(200).log().all();
			    
		
		
	}

	
	}



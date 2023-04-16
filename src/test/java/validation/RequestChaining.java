package validation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic_Package.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo_class.CreatedProject;

import static io.restassured.RestAssured.*;

public class RequestChaining 
{
	@Test
	public void main()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		JavaUtility j=new JavaUtility();
		
		//POJO Class
		CreatedProject json=new CreatedProject("Sonu","Flipkart"+j.getRandomNo(),"On-Going",14);
		
//		JavaUtility j=new JavaUtility();
//		 JSONObject json = new JSONObject();
//		    json.put("createdBy","Tanweer1");
//		    json.put("projectName","Amazon"+j.getRandomNo());
//		    json.put("status","Created");
//		    json.put("teamsize",10);
//		
         Response resp = given().body(json).contentType(ContentType.JSON)
         .when().post("/addProject");
         
         String proId = resp.jsonPath().get("projectId");
         System.out.println(proId);
         resp.then().log().all();
         
       //  using pathParam
//         given().pathParam("pid", proId)
//         .when().get("/projects/{pid}")
//         .then().assertThat().statusCode(200).contentType(ContentType.JSON);
//        
       // using Variable
          when().get("/projects/"+proId)
         .then().assertThat().statusCode(200).contentType(ContentType.JSON);
	}

}

package Data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_Package.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojo_class.CreatedProject;

public class CreateMultiple
{
	
	@Test(dataProvider= "getData")
	public void main(String createdBy,String projectName,String status,int teamSize)
	{
		baseURI="http://rmgtestingserver";
	    port=8084;
		JavaUtility j=new JavaUtility();
		CreatedProject cp=new CreatedProject(createdBy,projectName+j.getRandomNo(),status,teamSize);
		
		given().body(cp).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().log().all();
	}

	@DataProvider(name="getData")
	public Object[][] Data()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0] = "Sahil";
		data[0][1] = "Dell";
		data[0][2] = "Completed";
		data[0][3] = 12;
		
		data[1][0] = "Ayyaz";
		data[1][1] = "HP";
		data[1][2] = "Created";
		data[1][3] = 15;
		
		data[2][0] = "Swarnlata";
		data[2][1] = "TYSS";
		data[2][2] = "On Going";
		data[2][3] = 20;
		
		
		return data;
	}
}

package github;

import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_Package.JavaUtility;
import github_Pojo.GithubPojo;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateMultipleProjectWithDiffData 
{
	@DataProvider(name="getData")
	public Object[][] create()
	{
		Object[][] data=new Object[3][3];
		
		data[0][0]="Tanweer";
		data[0][1]="Automation Engineer";
		data[0][2]="Login";
		
		data[1][0]="Mir";
		data[1][1]="Devops";
		data[1][2]="logout";
		
		data[2][0]="Shyam";
		data[2][1]="Developer";
		data[2][2]="Homepage";
		return data;
	}
		
		
		@Test(dataProvider="getData")
		public void createProject(String name,String designation,String homepage)
		{
			baseURI="https://api.github.com";
			String token="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";
			
			JavaUtility j=new JavaUtility();
			GithubPojo gp=new GithubPojo(name+j.getRandomNo(),designation,homepage);
			
			given().body(gp).contentType(ContentType.JSON).auth().oauth2("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")
			
			.when().post("/user/repos")
			.then().assertThat().statusCode(201).log().all();
		}
			
		
}


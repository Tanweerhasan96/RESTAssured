package github;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dynamic_Response_Validation
{
	@Test
	public void dynamic()
	{
		String expData="Maahi409";
		baseURI="https://api.github.com";
		
		Response resp = when().get("/users/Tanweerhasan96/repos");
		
		boolean flag=false;
		List<String> body = resp.jsonPath().get("name");
		
		for(String b:body)
		{
			if(b.equalsIgnoreCase(expData))
			{
				flag=true;
			}
		}
		
		Assert.assertTrue(flag);
		System.out.println("Data Verified");
		resp.then().time(Matchers.lessThan(50L),TimeUnit.SECONDS).log().all();
	}

}

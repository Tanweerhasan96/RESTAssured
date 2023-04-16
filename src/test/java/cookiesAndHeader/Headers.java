package cookiesAndHeader;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Headers
{
	@Test
	public void getHeader()
	{
		Response res = given()
		.when().get("https://www.google.com/");
		
		//get single header and value
		String header = res.getHeader("Cache-Control");
		System.out.println("Cache-Control = "+header);
		 
		
		//get all the headers and values
	   io.restassured.http.Headers headers=res.getHeaders();
	   
	   for(Header hd:headers)
	   {
		   System.out.println(hd.getName()+"   "+hd.getValue());
	   }
	   
		
				
	}

}

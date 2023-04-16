package cookiesAndHeader;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Map;

public class Cookies
{
	//get single cookie
	@Test
	public void getCookie()
	{
		Response res = given()
		
		.when().get("https://www.google.com/");
		
		String cookie_value = res.getCookie("AEC");//get single cookies
		System.out.println("Cookie value :---"+cookie_value);
		
		//all the cookies
		Map<String, String> cookies_values = res.getCookies();
		for(String k:cookies_values.keySet())
		{
			String cookie = res.getCookie(k);
			System.out.println(k+" "+cookie);
		}
		
		
		
	}
}

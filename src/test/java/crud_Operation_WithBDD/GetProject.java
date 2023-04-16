package crud_Operation_WithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
//TY_PROJ_19005
public class GetProject 
{
	@Test
	public void getProject()
	{

		baseURI="http://rmgtestingserver";
		port=8084;
		when().get("http:/projects/TY_PROJ_19005")
		.then().assertThat().contentType(ContentType.JSON).and().statusCode(200).log().all();
	}

	
	}



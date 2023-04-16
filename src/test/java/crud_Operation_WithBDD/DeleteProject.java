package crud_Operation_WithBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteProject 
{
	@Test
	public void delete()
	{

		baseURI="http://rmgtestingserver";
		port=8084;
		when().delete("/projects/TY_PROJ_19005")
		.then().assertThat().statusCode(204).log().all();
	}
	

}

package petSwagger;

import org.testng.annotations.Test;

import generic_Package.JavaUtility;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import pojo_class.Category_PetStrore;
import pojo_class.PetStrore_Pet;

public class CreatePetStore_withBDD
{
	@Test
	public void create() 
	{
		JavaUtility ju = new JavaUtility();
		Category_PetStrore sp_cat = new Category_PetStrore(32,"Tiger");
		Category_PetStrore st = new Category_PetStrore(22,"Soni");
		Category_PetStrore[] tag= {st};
		String[]url= {"Nilofar"};
		PetStrore_Pet p = new PetStrore_Pet(13+ju.getRandomNo(),sp_cat,"kafil",url,tag,"created");
		
		RequestSpecification req = given().body(p);
		Response resp = req.post("https://petstore.swagger.io/v2");
		String path = resp.jsonPath().get("id");
	    String body = resp.prettyPrint();
	    System.out.println(body);
		
	}

}

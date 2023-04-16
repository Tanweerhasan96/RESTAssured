package deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo_class.PetStrore_Pet;

public class PetStrore_Deserialization 
{
	@Test
	public void deserialization_PetStrore() throws  IOException
	{
		ObjectMapper objMap = new ObjectMapper();
		PetStrore_Pet pj = objMap.readValue(new File("./Petstore.json"),PetStrore_Pet.class);
		System.out.println(pj.getId());
//		System.out.println(pj.getCategory());
//		System.out.println(pj.getName());
//		System.out.println(pj.getStatus());
//		System.out.println(pj.getTags());
	}

}

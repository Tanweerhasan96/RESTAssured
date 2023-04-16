package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo_class.Category_PetStrore;
import pojo_class.PetStrore_Pet;

public class PetStrore_Serialization 
{
	@Test
	public void create() throws JsonGenerationException, JsonMappingException, IOException
	{
		Category_PetStrore sp_cat = new Category_PetStrore(23,"Tanweer");
		 Category_PetStrore st = new Category_PetStrore(21,"Nagma");
		 Category_PetStrore[] tag= {st};
		String[]url= {"Nafish"};
		PetStrore_Pet p = new PetStrore_Pet(12,sp_cat,"Tannu",url,tag,"created");
		ObjectMapper o=new ObjectMapper();
		o.writeValue(new File("./Petstore.json"), p);
		
	}

}

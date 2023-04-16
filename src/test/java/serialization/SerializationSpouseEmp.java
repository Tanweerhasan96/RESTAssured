package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojo_class.Employee_Spouse;
import pojo_class.Spouse;

public class SerializationSpouseEmp {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException
	{
		
		long arr[]= {84569,83971};
		Spouse sp = new Spouse("Nagma",32,arr);
		Employee_Spouse empSp = new Employee_Spouse("Tanweer",sp);
		ObjectMapper objmap = new ObjectMapper();
		objmap.writeValue(new File("./spouseEmp.json"), empSp);

	}

}

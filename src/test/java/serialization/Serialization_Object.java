package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojo_class.Create_Employee;

public class Serialization_Object {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		long arr[]= {845690,3971};
		Create_Employee emp=new Create_Employee("Tanweer",321,"QA",false,arr);
		ObjectMapper objMapper=new ObjectMapper();
		objMapper.writeValue(new File("./employee.json"), emp);

	}

}

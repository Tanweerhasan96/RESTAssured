package deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojo_class.Employee_Spouse;

public class DeserializationSpouseEmp {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{
		ObjectMapper objMap = new ObjectMapper();
		Employee_Spouse esp = objMap.readValue(new File("./spouseEmp.json"),Employee_Spouse.class);
		System.out.println(esp.getName());
		System.out.println(esp.getSp().getName());
		System.out.println(esp.getSp().getId());
		for(int i=0;i<esp.getSp().getPhoneNo().length;i++)
		{
			System.out.print(esp.getSp().getPhoneNo()[i]);
		}
		System.out.println();

	}

}

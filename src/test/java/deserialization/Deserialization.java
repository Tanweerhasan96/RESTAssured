package deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojo_class.Create_Employee;

public class Deserialization {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{
		ObjectMapper objMapper1 = new ObjectMapper();
		Create_Employee e1 = objMapper1.readValue(new File("./employee.json"),Create_Employee.class);
        System.out.println(e1.getName());
        System.out.println(e1.getEmpId());
        System.out.println(e1.getDesignation());
        for(int i=0;i<e1.getMobileNo().length;i++)
        {
        	 System.out.print(e1.getMobileNo()[i]);
        }
       
        		
	}

}

package pojo_class;

public class Employee_Spouse 
{
	String name;
	Spouse sp;
	
	public Employee_Spouse(String name,Spouse sp)
	{
		this.name=name;
		this.sp=sp;
	}
	public Employee_Spouse(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Spouse getSp() {
		return sp;
	}
	public void setSp(Spouse sp) {
		this.sp = sp;
	}

}

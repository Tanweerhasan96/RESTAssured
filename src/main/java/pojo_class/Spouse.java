package pojo_class;

public class Spouse
{
	String name;
	int id;
	long[]phoneNo;
	public Spouse(String name,int id,long[]phoneNo)
	{
		this.name=name;
		this.id=id;
		this.phoneNo=phoneNo;
	}
	public Spouse(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long[] getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long[] phoneNo) {
		this.phoneNo = phoneNo;
	}
	

}

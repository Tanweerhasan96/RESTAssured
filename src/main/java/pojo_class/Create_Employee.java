package pojo_class;

public class Create_Employee
{
	String name;
	int empId;
	String designation;
	boolean mstatus;
	long [] mobileNo;
	
	public Create_Employee(String name,int empId,String designation,boolean mstatus,long[]mobileNo)
	{
		this.name=name;
		this.empId=empId;
		this.designation=designation;
		this.mstatus=mstatus;
		this.mobileNo=mobileNo;
	}
	public Create_Employee()
	{
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public boolean getMstatus() {
		return mstatus;
	}
	public void setMstatus(boolean mstatus) {
		this.mstatus = mstatus;
	}
	public long[] getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long[] mobileNo) {
		this.mobileNo = mobileNo;
	}

}

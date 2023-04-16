package github_Pojo;

public class GithubPojo
{
	String name;
	String designation;
	String homepage;
	public GithubPojo(String name,String designation,String homepage)
	{
		this.name=name;
		this.designation=designation;
		this.homepage=homepage;
	}
	GithubPojo(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	
	
}

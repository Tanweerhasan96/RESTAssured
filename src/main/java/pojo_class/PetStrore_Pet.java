package pojo_class;

public class PetStrore_Pet 
{
	int id;
	Category_PetStrore category;
	String name;
	String[] photoUrls;
	Category_PetStrore[]tags;
	String status;
	public PetStrore_Pet(int id, Category_PetStrore category, String name,String[]photoUrls,Category_PetStrore []tags, String status) {
		this.id=id;
		this.category=category;
		this.name=name;
		this.photoUrls=photoUrls;
		this.tags=tags;
		this.status =status;
	}
	public PetStrore_Pet() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Category_PetStrore getCategory() {
		return category;
	}
	public void setCategory(Category_PetStrore category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(String[] photoUrls) {
		this.photoUrls = photoUrls;
	}
	public Category_PetStrore[] getTags() {
		return tags;
	}
	public void setTags(Category_PetStrore[] tags) {
		this.tags = tags;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}

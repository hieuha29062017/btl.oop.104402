package entity;

public class Person extends Entity {
	private String job;
	
	public void setName(String vs){
		this.name = vs;
	}
	
	public void setDescription(String vs){
		this.description = vs;
	}
	
	public void setSource(Source arg){
		this.source = arg;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getDes(){
		return this.description;
	}
	
	public Source getSource(){
		return this.source;
	}
}

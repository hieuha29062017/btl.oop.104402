package entity;

public class Location extends Entity {
	public Location(String id, String name, String des, Source src){
		super(id, name, des, src);
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

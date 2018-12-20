package entity;

public class Entity {
	protected String identify;
	protected String name;
	protected String description;
	protected Source source;

	
	public Entity(String id, String name, String des, Source src){
		this.identify = id;
		this.name = name;
		this.description = des;
		this.source = src;
	}
		
	public String getID(){
		return this.identify;
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

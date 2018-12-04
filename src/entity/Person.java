package entity;

public class Person extends Entity {
	public Person(String id, String name, String des, Source src){
		super(id, name, des, src);
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

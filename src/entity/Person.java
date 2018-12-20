package entity;

public class Person extends Entity {
	public String job;
	public String age;
	public Person(String id, String name,String age, String job, String des, Source src){
		super(id, name, des, src);
		this.age = age;
		this.job = job;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}

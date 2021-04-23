package exam07;

public class Student2 {
	public enum Sex { MALE,FEMALE }
	public enum City { Seoul,Pusan }
	
	private String name;
	private int score;
	private Sex sex;
	private City city;
	
	public Student2(String name, int Score, Sex sex) {
		this.name  = name;
		this.score = score;
		this.sex   = sex;
	}
	
	public Student2(String name, int Score, Sex sex , City city) {
		this.name  = name;
		this.score = score;
		this.sex   = sex;
		this.city  = city;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Sex getSex() {
		return sex;
	}

	public City getCity() {
		return city;
	}
	
	
}

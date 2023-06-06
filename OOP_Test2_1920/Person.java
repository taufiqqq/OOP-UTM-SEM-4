public class Person{
	private String gender;
	private int age;
	private String background;
	private String status;

	public Person(String gender, int age, String background, String status) {
		this.gender = gender;
		this.age = age;
		this.background = background;
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getBackground() {
		return background;
	}

	public String getStatus() {
		return status;
	}

	
}
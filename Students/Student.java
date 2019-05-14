package Students;

public class Student {
	private String school;
	private String name;
	
	public Student(String school,String name) {
		this.school=school;
		this.name=name;
	}
/*	建立Student時已定義
	public void setName(String name) {
		this.name = name;
	}
	*/
	public String getName() {
		return name;
	}
/*	
	public void setSchool(String school) {
		this.school = school;
	}
	*/
	public String getSchool() {
		return school;
	}

}

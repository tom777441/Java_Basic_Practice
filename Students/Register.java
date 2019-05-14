package Students;

public class Register {
	public static void main (String[] args) {
		Student S1 = new Student("NCU","xiao-min");
		Student S2 = new Student("NCU","xiao-men");
		Student S3 = new Student("NCU","xiao-won");
		
		Student course[] = {S1,S2,S3};
		for(int i=0;i<course.length;i++) {
			System.out.println(course[i].getName()+ "  "+course[i].getSchool());
		}
	}
}

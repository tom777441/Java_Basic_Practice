package Employee_inherit.copy;

public class CommissionEmployeeTest {
	public static void main(String[] args) {
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Sue","John","222-22-2222",10000,.06,6000);
		
		//逐一輸出
		System.out.println("Employee infor obtained by get method: \n");
		System.out.printf("%s %s\n","First name is",employee.getFirstName());
		System.out.printf("%s %s\n","Last name is",employee.getLastName());
		System.out.printf("%s %s\n","Social security number is",employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f\n","Gross sales is",employee.getGrossSales());
		System.out.printf("%s %.2f\n","Commission rate is",employee.getCommissionRate());
		System.out.printf("%s %.2f\n","Base salary is",employee.getBaseSalary());
		System.out.printf("%s %.2f\n","Earnings is",employee.eranings());
		//overloading
		employee.setCommissionRate(.1);
		employee.setGrossSales(500);
		
		//透過toString()格式輸出
		System.out.printf("\n%s:\n \n%s\n","Updated employee info obtained by toString",employee);

	}
}

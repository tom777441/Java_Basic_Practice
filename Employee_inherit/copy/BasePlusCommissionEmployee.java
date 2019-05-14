package Employee_inherit.copy;
/*非使用繼承
  在原有的程式碼新增*/
public class BasePlusCommissionEmployee extends CommissionEmployee{

	private double baseSalary;
	
	public BasePlusCommissionEmployee(String first,String last,String ssn,
			double sales, double rate,double salary) {
		super(first,last,ssn,sales,rate);
		setBaseSalary(salary);
	}
	
	public void setBaseSalary(double salary) {
		baseSalary = (salary <0.0)?0.0:salary;
				}
	public double getBaseSalary() {
		return baseSalary;
	}
	
	
	public double eranings() {
		return baseSalary + (commissionRate*grossSales);
	}
	
	
	@Override //indicates
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
				"commission employee",firstName,lastName,
				"social security number",socialSecurityNumber,
				"gross sales",grossSales,
				"commissionrate",commissionRate,
				"base salary",baseSalary);
	}
	
}
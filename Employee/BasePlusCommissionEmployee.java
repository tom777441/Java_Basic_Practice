package Employee;
/*非使用繼承
  在原有的程式碼新增*/
public class BasePlusCommissionEmployee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String first,String last,String ssn,
			double sales, double rate,double salary) {
		firstName = first;
		lastName = last;
		socialSecurityNumber =ssn;
		setGrossSales(sales);
		setCommissionRate(rate);
		setBaseSalary(salary);
	}
	
	public void setFirstName(String first) {
		firstName = first;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String last) {
		lastName = last;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber = ssn;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public void setGrossSales(double sales) {
		grossSales = (sales < 0.0) ? 0.0 :sales;
	}
	public double getGrossSales() {
		return grossSales;
	}
	
	public void setCommissionRate(double rate) {
		commissionRate = (rate>0.0 && rate < 1)?rate :0.0;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	
	public double eranings() {
		return baseSalary + (commissionRate*grossSales);
	}
	
	public void setBaseSalary(double salary) {
		baseSalary = (salary <0.0)?0.0:salary;
				}
	public double getBaseSalary() {
		return baseSalary;
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
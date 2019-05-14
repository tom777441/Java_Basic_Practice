package Employee_inherit.copy;

public class CommissionEmployee {
	//使用protected 子類別才可直接使用
	protected String firstName;
	protected String lastName;
	protected String socialSecurityNumber;
	protected double grossSales;
	protected double commissionRate;
	
	public CommissionEmployee(String first,String last,String ssn,
			double sales, double rate) {
		firstName = first;
		lastName = last;
		socialSecurityNumber =ssn;
		setGrossSales(sales);
		setCommissionRate(rate);
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
		return commissionRate*grossSales;
	}
	
	@Override //indicates
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
				"commission employee",firstName,lastName,
				"social security number",socialSecurityNumber,
				"gross sales",grossSales,
				"commissionrate",commissionRate);
	}
	
}

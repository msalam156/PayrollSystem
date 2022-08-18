
public class GuidanceCounselor extends SchoolEmployee {
	// add department variable
	private String Department = "";
	// define default constructor and call super() {parent class constructor}
	GuidanceCounselor(){
		super();
	};
	// define parameterized constructor and initialize all instance variables
	GuidanceCounselor(String name,int id, int years,String Department){
		super(name,id,years);
		this.setDepartment(Department);
		
	};
	 // getter method for department
	public String getDepartment() {
		return Department;
	}
	 // setter method for department
	public void setDepartment(String department) {
		Department = department;
	}
	// define getHours method that return total hours of GuidanceCounselor
	@Override
	public int getHours() {
		int hr = super.getHours();
		int totalHour = hr + 10;
		return totalHour;
	}
	 // getter method for salary that return the total salary of GuidanceCounselot
	@Override
	public double getSalary() {
		double baseSalary = super.getSalary();
		int year = this.getYears(); 
		double salary = 500 * year;
		return salary + baseSalary + 10000;
	}
	
}



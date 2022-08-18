
public class Nurse extends SchoolEmployee {
	// add department variable
	private String Department = "";
	// define default constructor and call super() {parent class constructor}
	Nurse(){
		super();
	};
	// define parameterized constructor and initialize all instance variables
	Nurse(String name,int id, int years,String Department){
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
	//getter method for Hours that return the total Hours of Secretary
	@Override
	 public double getSalary() {
		double baseSalary = super.getSalary();
		int year = this.getYears(); 
		double salary = 500 * year;
		return salary + baseSalary + 5000;
	}
	
}

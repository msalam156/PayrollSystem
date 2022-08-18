
public class Teacher extends SchoolEmployee {
	// add department variable
	private String Department = "";
	// define default constructor and call super() {parent class constructor}
	Teacher(){
		super();
	};
	// define parameterized constructor and initialize all instance variables
		Teacher(String name,int id, int years,String Department){
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
	//getter method for salary that return the total salary of Teacher
	@Override
	public double getSalary() {
		double baseSalary = super.getSalary();
		int year = this.getYears(); 
		double salary = 1000 * year;
		return salary + baseSalary ;
	}
	
}

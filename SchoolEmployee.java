
public class SchoolEmployee {
	// initialize variables 
	private String name = "";
	private int id;
	private int years;
	// default constructor
	SchoolEmployee(){};
	// parameterized Constructor of SchoolEmployee and initialize the instance variables
	SchoolEmployee(String name,int id, int years){
		this.setName(name);
		this.setId(id);
		this.setYears(years);
		Staff.list.add(this);
	}
	//define isTenure method and return boolean 
	public boolean isTenure() {
		if(years > 4) return true;
		else return false;
	}
	// define getSalary method and return baseSalary
	public double getSalary() {
		return 55000;
	}
	// define getHours method and return hours
	public int getHours() {
		return 40;
	}
	// getter method for name
	public String getName() {
		return name;
	}
	// setter method for name
	public void setName(String name) {
		this.name = name;
	}
	// getter method for id
	public int getId() {
		return id;
	}
	// setter method for id
	public void setId(int id) {
		this.id = id;
	}
	// getter method for years
	public int getYears() {
		return years;
	}
	// setter method for years
	public void setYears(int years) {
		this.years = years;
	}
	
	
}

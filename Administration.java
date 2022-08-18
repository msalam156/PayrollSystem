
public class Administration extends SchoolEmployee {
	// add title variable
	private String title = "";
	// define default constructor and call super() {parent class constructor}
	Administration(){
		super();
	};
	// define parameterized constructor and initialize all instance variables
	Administration(String name,int id, int years,String title){
		super(name,id,years);
		this.setTitle(title);
		
	};
	// getter method for title
	public String getTitle() {
		return title;
	}
	// setter method for set Title
	public void setTitle(String title) {
		this.title = title;
	}
	// getter method for calculating the total hours of Administration
	@Override
	public int getHours() {
		int hr = super.getHours();
		int totalHour = hr + 25;
		return totalHour;
	}
	// getter method for calculation the total salary of Administration
	@Override
	public double getSalary() {
		double baseSalary = super.getSalary();
		int year = this.getYears(); 
		double salary = 2000 * year;
		return salary + baseSalary + 60000 ;
	}
	
}

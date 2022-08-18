import java.util.ArrayList;
import java.util.List;

public class Staff {
	// creating a list as with static keyword , because it common for all classes
	static List<SchoolEmployee> list = new ArrayList<>();
	public static void main(String [] arg) {
		// call method to insert the employee data;
		insertData();
		// call findAvgSalary method to find Average Salary and store it in a  Variable
		double AverageSalary = findAvgSalary();
		// print Average Salary
		System.out.println("Average Salary : £"+AverageSalary);
		// call findWorHor method to find Average Worked Hour and store it in a  Variable
		int workHour = findWorkHour();
		// print Average work Hour
		System.out.println("Average hours worked (per week) : "+workHour);
		// call tenurStaff Method to find the number of tenur Staff
		int tenurStaff = findTenure();
		System.out.println("Number of Non-tenured staff: "+tenurStaff);
		
	}
	//define insertData method 
	public static void insertData() {
		// create object of SchoolEmployee and assign the values
		SchoolEmployee emp1  = new Administration("Brad Evans",4637,16,"Principle");
		SchoolEmployee emp2  = new Administration("Kevin Stall",6127,8,"Assistant Principle");
		SchoolEmployee emp3  = new GuidanceCounselor("Melanie Trice",2621,7,"GuidanceCounselor");
		SchoolEmployee emp4  = new GuidanceCounselor("Ryan Young",6171,1,"GuidanceCounselor");
		SchoolEmployee emp5  = new Secretary("Nicole Cater",9012,2,"Secretary");
		SchoolEmployee emp6  = new Secretary("Adam Lane",8912,6,"Secretary");
		SchoolEmployee emp7  = new Secretary("Julie Jones",7181,14,"Secretary");
		SchoolEmployee emp8  = new Teacher("Catherin Pope",0012,29,"Teacher");
		SchoolEmployee emp9  = new Teacher("Bryan Lang",6910,12,"Teacher");
		SchoolEmployee emp10 = new Teacher("Emma Williams",4152,3,"Teacher");
		SchoolEmployee emp11 = new Nurse("Barbara Hill",9333,33,"Nurse");
	}
	
	// define findAvgSalary 
	public static double findAvgSalary() {
		double totalSal = 0;
		for(int i =0; i< Staff.list.size(); i++) {
			// finding total salary of all employee
			totalSal += Staff.list.get(i).getSalary();
			
		}
		// find the of employee
		int emp = list.size();
		// calculating the average salary of employees
		double avgSalray = totalSal / emp;
		return avgSalray;
	}
	// define findWorHor and return average work hour
	public static int findWorkHour() {
		int totalHour = 0;
		for(int i =0; i< Staff.list.size(); i++) {
			totalHour += Staff.list.get(i).getHours();
			
		}
		int emp = list.size();
		int avgWorkHour = totalHour / 11;
		return avgWorkHour;
	}
	// define findTenure Method for calculating the tenur employees
	public static int findTenure() {
		int count =0;
		for(int i =0; i< Staff.list.size(); i++) {
			if(Staff.list.get(i).isTenure())  continue;
			else count++;
			
		}
		return count;
	}
	
	
}

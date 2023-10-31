package staticKeywords;

public class Employee {
	int empid;
	String empname;
	static String companyname = "Simplilearn";
	
	//Create a constructor
	public Employee(int empid,String empname) {
		this.empid = empid;
		this.empname = empname;
	}
	
	public void displayvalues() {
		System.out.println(empid + " " + empname + " " + companyname);
	}

	public static void main(String[] args) {
		Employee emp = new Employee(202,"Shruthi");
		emp.displayvalues();
		Employee emp1 = new Employee(400,"Santhosh");
		emp1.displayvalues();
		
		Employee.companyname = "TCS";
		emp.displayvalues();
		emp1.displayvalues();

	}

}

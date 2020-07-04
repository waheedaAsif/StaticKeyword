package StaticKeyWord;

public class Employee {

	 int empid;      
	 String name;
	 static String company = "abc";
	 
	 public Employee( int empid, String name) {
		 this.empid = empid;
		 this.name = name;
		
	 }
	 
	 public void Employee2() {
		 System.out.println(empid+ " "+name+ " "+ company);
	 }
	 
	 
}

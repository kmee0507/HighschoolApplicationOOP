
public class Teacher extends Person {
	protected String subject;
	protected double salary;
	
	Teacher(String myName, int myAge, String myGender, String sub, double sal){
		super(myName,myAge,myGender);
		subject = sub;
		salary = sal;
	}
	
	public String getSubject(){
		return subject;
	}
	public double getSalary(){
		return salary;
	}
	public void setSubject(String sub){
		subject = sub;
	}
	public void setSalary(double sal){
		salary = sal;
	}
	public String toString(){
		return super.toString() + " Salary: " + salary + " subject: " + subject;
	}
}

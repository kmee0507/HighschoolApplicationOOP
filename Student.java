
public class Student extends Person {
	protected String myIdNum;
	protected double myGPA;
	
	public Student(String name, int age, String gender, String idNum, double GPA){
		super(name, age, gender);
		myIdNum = idNum;
		myGPA = GPA;
	}
	public String getMyIdNum(){
		return myIdNum;
	}
	public double getMyGPA(){
		return myGPA;
	}
	public void setMyIdNum(String idNum){
		myIdNum = idNum;
	}
	public void setMyGPA(double GPA){
		myGPA = GPA;
	}

}

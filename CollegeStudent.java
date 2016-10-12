
public class CollegeStudent extends Student {
	protected String major;
	protected int year;
	
	CollegeStudent(String myName, int myAge, String myGender, String myIdNum,
			double myGPA, int y, String maj){
		super(myName,myAge,myGender,myIdNum,myGPA);
		year = y;
		major = maj;
	}
	
	public int getYear(){
		return year;
	}
	public String getMajor(){
		return major;
	}
	public void setYear(int y){
		year = y;
	}
	public void setMajor(String maj){
		major = maj;
	}

	public String toString(){
		return super.toString() + " Year: "+ year + " Major: " + major;
	}
}

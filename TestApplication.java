
public class TestApplication {
	
	public static void main(String[] args){
		Person bob = new Person("Coach Bob", 27, "M");
		System.out.println(bob);
		
		Student roger = new Student("Roger Rabbit", 23, "M","RR200012",4.0);
		System.out.println(roger);
		
		Teacher mrJava = new Teacher("Duke Java",50, "M", "Computer Science", 200000);
		System.out.println(mrJava);
		
		CollegeStudent jess = new CollegeStudent("Jess Jessers", 19, "F", "JJ200015",3.8,2,"History");
		System.out.println(jess);
	}

}

/** driver program to test methods */



import java.util.Scanner;
public class SchoolKidtest {

	

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		char repeat;
	do {
		
		Schoolkid a= new Schoolkid();
		 
			System.out.println("Student age :" + a.getStudentname());
			System.out.println("Student name :" + a.getStudentname());
			System.out.println("Teacher name" + a.getTeachername());
			a.setAge(12);
			a.setStudentname("kim");
			a.setTeachername("miss kimmy");
		
		
		System.out.println();
	
         a.writeOutput();
		
		Schoolkid b= new Schoolkid();
	
		System.out.println();
		b.writeOutput();
	
		System.out.println("Student age :" + b.getAge());
		System.out.println("Student name :" +b.getStudentname());
		System.out.println("Teacher name" + b.getTeachername());
		b.setAge(10);
		b.setStudentname("Monty");
		b.setTeachername("Miss jones");
		
		ExtremeSchoolKid j= new  ExtremeSchoolKid();
		j.writeOutput();
		System.out.println();
		System.out.println(" the grade is :" + j.getGrade());
		System.out.println(" the grade is :" + j.isPass());
		
		j.setAge(23);
		j.setGrade(2);
		j.setPass(true);
	
		
		
	
		 
		   
		System.out.println("Do again? (Y for Yes, or N for No)");
		
		
		repeat= s.next().charAt(0);
		
	} while (repeat == 'y' || (repeat == 'Y'));
		
	
	}

}

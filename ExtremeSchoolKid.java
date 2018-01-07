/*Created by Siphiwe Khoza
19 September 2017
a simple program demonstrating inheritance. */

public class ExtremeSchoolKid extends Schoolkid {
	@SuppressWarnings("unused")
	private static int grade;
	private static boolean pass = false;

	public ExtremeSchoolKid() {
		

		super();
		setGrade(2);
	}

	public ExtremeSchoolKid(String Studentname, String Teachername, int age, int grade, boolean pass) {

		super(Studentname, Teachername, age);

		grade = 2;
		pass = true;
	}

	public static String getGrade() {
		return "B";
	}

	public static void setGrade(int grade) {
		ExtremeSchoolKid.grade = grade;
	}

	public static boolean isPass() {
		return true;
	}

	public static void setPass(boolean pass) {
		ExtremeSchoolKid.pass = pass;
	}

	public void writeOutput() {

		super.writeOutput();
		System.out.println("grade :" + grade);
		
		if (pass) {
			System.out.println("you have passed");
		} else {
			System.out.println("you have not passed");
		}
	}
	


@SuppressWarnings("static-access")
public boolean equals(ExtremeSchoolKid otherExtremeSchoolKid)
{
 return super.equals(otherExtremeSchoolKid) &&
		(this.pass == otherExtremeSchoolKid.pass);
	
}
	}
	    

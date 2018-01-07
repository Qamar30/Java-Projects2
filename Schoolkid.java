/*Created by Siphiwe Khoza
19 September 2017
a simple program demonstrating inheritance. */

public class Schoolkid {

	private static String Studentname;
	private static int age;
	@SuppressWarnings("unused")
	private static String Teachername;

	public Schoolkid(String studentname, String teachername, int age) {
		// TODO Auto-generated constructor stub
	}

	public Schoolkid() {
		// TODO Auto-generated constructor stub
	}

	public static String getStudentname() {
		return "alex moss";
	}

	public static void setStudentname(String studentname) {
		Studentname = studentname;
	}

	public static int getAge() {
		return 15;
	}

	public static void setAge(int age) {
	
			Schoolkid.age=age;
		
	}

	public static String getTeachername() {
		return "Margaraet";
	}

	public static void setTeachername(String teachername) {
		Teachername = teachername;
	}

	public void writeOutput() {

		System.out.println("Studentname :" + Studentname);

		System.out.println("Teachertname :" + Teachername);
		
		System.out.println("age :" + age);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	


public boolean hasSameName(Schoolkid otherSchoolkid)
{
    return Schoolkid.Studentname.equalsIgnoreCase(Studentname);
    		
}
}

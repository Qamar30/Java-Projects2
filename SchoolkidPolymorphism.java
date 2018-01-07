
public class SchoolkidPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Schoolkid[] student= new Schoolkid[4];
		student[0]= new Schoolkid("Charles, Knox", null, 8);
		student[1]= new Schoolkid("Boobt, brown", null, 12);
		student[2]= new Schoolkid("Alexis, Vidal", null, 14);
		student[3]= new Schoolkid("John, hand", null, 15);
		for(Schoolkid s:student)
		{
			s.writeOutput();
			System.out.println();
			
		}
	}

}

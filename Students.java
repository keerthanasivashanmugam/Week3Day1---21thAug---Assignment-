package week3.day2;

public class Students {

	//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
	
	public void getStudentInfo(int id)
	{
		System.out.println("ID : "+id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("ID : "+id+"\nName : "+name);
	}
	
	public void getStudentInfo(String email,long phoneNumber)
	{
		System.out.println("Phone Number : "+phoneNumber+"\nEmail : "+email);
	}
	
	public static void main(String[] args) {
		
		Students info = new Students();
		info.getStudentInfo(5120023);
		info.getStudentInfo(5120023, "Keerthana S");
		info.getStudentInfo("Keerthana@gmail.com", 9876543214l);
		
		
	}

}

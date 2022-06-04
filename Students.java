package week3.day1;

public class Students {
	public void getStudentInfo()
	{
		System.out.println("Student Information is :  ");
	}
	public void getStudentInfo(int Id)
	{
		System.out.println("Student Id is :  "+Id);
	}
	public void getStudentInfo(int Id, String Name)
	{
		System.out.println("Student Id is :  "+Id);
		System.out.println("Student Name is :  "+Name);
		
	}
	public void getStudentInfo(String email, double phno)
	{
		System.out.println("email id is :  "+email);
		System.out.println("phone number  is :  "+phno);
		
	}
	public static void main(String[] args)
	{
		Students stdinfo = new Students();
		stdinfo.getStudentInfo();
		stdinfo.getStudentInfo(3);
		stdinfo.getStudentInfo(3,"Hema");		
		stdinfo.getStudentInfo("Hema@gmail.com",99999);
		
		
		
	}
}

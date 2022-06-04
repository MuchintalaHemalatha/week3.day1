package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatsapp()
	{
	System.out.println("Whatsapp msg to Mani");
	
		}
public void takevideo()
	
	{	
		System.out.println("Make a video of mine and Mani");
	}
	
	
	
	public static void main(String[] args)
	{
		SmartPhone smPh = new SmartPhone();
		//smPh.sendMsg();
		//smPh.makeCall();
		//smPh.saveContact();
		//smPh.connectWhatsapp();
		smPh.takevideo();
		
		
	}
}

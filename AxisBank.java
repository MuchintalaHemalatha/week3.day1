package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("Deposit Amount from Account Branch ");
	}


	public static void main(String[] args) {
		AxisBank AB=new AxisBank();
		AB.deposit();
		AB.saving();
		AB.fixed();

	}

}

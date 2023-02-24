package week2.day1;

public class AxisBank extends BankInfo {
	

	public void deposit() {
		System.out.println("deposit amount");
	}
	public static void main(String[] args) {
		
	
	AxisBank bank=new AxisBank();
	bank.deposit();
	bank.fixed();
	bank.saving();
	
	}

}

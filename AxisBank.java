package week3.day2;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Deposit method from AxisBank Class : Overrriding");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		System.out.println("Calling methods from BankInfo Class :");
		bank.saving();
		bank.fixed();
		System.out.println("\nCalling Deposit method from AxisBank Class : Overriding");
		bank.deposit();

	}

}

package pillers;

public class SA extends Account {
	private int acc_Bal;
	private int min_Bal;
	public int getAcc_Bal() {
		return acc_Bal;
	}
	public void setAcc_Bal(int acc_Bal) {
		this.acc_Bal = acc_Bal;
	}
	public int getMin_Bal() {
		return min_Bal;
	}
	public void setMin_Bal(int min_Bal) {
		this.min_Bal = min_Bal;
	}
	public void deposit_Amount(int amount){
		this.acc_Bal = this.acc_Bal + amount;
	}
	
	public void cal_Bal() {
		//writing code for printing acc bal
		
		int bal = this.getAcc_Bal() -this.getMin_Bal();
		System.out.println(this.getAcc_Name()+"-Account Bal is:"+ bal);
		
	}
}

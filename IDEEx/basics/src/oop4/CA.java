package oop4;

public class CA extends Account {
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
	public void cal_Bal() {
		System.out.println(this.getAcc_Bal() - this.getMin_Bal());
	}
}

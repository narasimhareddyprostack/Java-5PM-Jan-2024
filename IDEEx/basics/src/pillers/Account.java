package pillers;

public class Account extends Bank {
	private int acc_Id;
	private String acc_Name;
	private String acc_Email;
	
	public int getAcc_Id() {
		return acc_Id;
	}

	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}

	public String getAcc_Name() {
		return acc_Name;
	}

	public void setAcc_Name(String acc_Name) {
		this.acc_Name = acc_Name;
	}

	public String getAcc_Email() {
		return acc_Email;
	}

	public void setAcc_Email(String acc_Email) {
		this.acc_Email = acc_Email;
	}

	public  void cal_Bal() {}

}

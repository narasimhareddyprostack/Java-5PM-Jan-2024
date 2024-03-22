package pillers;

public class Test {

	public static void main(String[] args) {
		SA s1=new SA();
		
		s1.setAcc_Id(101);
		s1.setAcc_Name("Rahul Gandhi");
		s1.setAcc_Email("rg@gmail.com");
		s1.setAcc_Bal(5600);
		s1.setMin_Bal(500);
		s1.deposit_Amount(10);
		s1.cal_Bal();
		
		CA c1=new CA();
		c1.setAcc_Id(201);
		c1.setAcc_Name("Priyanka");
		c1.setAcc_Email("priya@cong.com");
		c1.setAcc_Bal(75001);
		c1.setMin_Bal(25000);
		c1.cal_Bal();

	}

}

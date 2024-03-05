package oop4;

public class Test {

	public static void main(String[] args) {
		SA s1=new SA();
		s1.setAcc_Id(101);
		s1.setAcc_Name("Rahul");
		s1.setAcc_Email("Rg@gmail.com");
		s1.setAcc_Bal(5001);
		s1.setMin_Bal(500);

		CA c1=new CA();
		c1.setAcc_Id(201);
		c1.setAcc_Name("Sonia");
		c1.setAcc_Email("Sonia@gmail.com");
		c1.setAcc_Bal(75001);
		c1.setMin_Bal(25000);
		System.out.println("***********");
		s1.cal_Bal();
		c1.cal_Bal();
		System.out.println("***********");
		AccountService.get_Service(s1);
		AccountService.get_Service(c1);

	}

}

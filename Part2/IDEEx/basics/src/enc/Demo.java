package enc;

public class Demo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		
		e1.seteId(101);
		e1.seteName("Rahul Gandhi");
		e1.seteSal(45000.00);
		
		System.out.println("Employee Details");
		System.out.println("Emp Id:"+ e1.geteId());
		System.out.println("Emp Name:"+ e1.geteName());
		System.out.println("Emp Salary:"+ e1.geteSal());

	}

}

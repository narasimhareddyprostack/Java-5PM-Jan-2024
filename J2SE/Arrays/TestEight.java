class Employee{

}

class Test{
	public static void main(String[] args){
		
		int[] ids=new int[10];
		
		Object[] objs=new Object[4];
		
		String[] enames=new String[4];
		
		Employee[] employees=new Employee[10];
		
		//read array
		System.out.println(ids);
		System.out.println(objs);
		System.out.println(enames);
		System.out.println(employees);
		//read array elments - using indexing
		
		System.out.println(ids[0]);  //0
		System.out.println(objs[1]); //null
		System.out.println(enames[2]); //null 
		System.out.println(employees[3]);//null
	}

}
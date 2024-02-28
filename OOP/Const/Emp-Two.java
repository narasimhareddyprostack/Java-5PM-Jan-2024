class Emp{
    int eId;
    String eName;
    Emp(int id,String name){
         this.eId = id; 
         this.eName = name;  
    }
    public static void main(String[] args){

       Emp e1=new Emp(101,"Rahul");
       Emp e2=new Emp(102,"Sonia");
       Emp e3=new Emp(103,"Priyanka");

      

       System.out.println(e1.eName);
       System.out.println(e2.eName);
       System.out.println(e3.eName);
    }
}
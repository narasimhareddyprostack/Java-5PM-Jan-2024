class Emp{
    int eId;

    Emp(int id){
         this.eId = id;   
    }
    public static void main(String[] args){

       Emp e1=new Emp(101);
       Emp e2=new Emp(102);
       Emp e3=new Emp(103);

       System.out.println(e1);
       System.out.println(e2);
       System.out.println(e3);
       
       System.out.println(e1.eId);
       System.out.println(e2.eId);
       System.out.println(e3.eId);
    }
}
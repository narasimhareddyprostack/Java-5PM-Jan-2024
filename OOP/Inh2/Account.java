public class Account{
    int acc_Id;
    String acc_Name;

    public Account(int id, String name){
        this.acc_Id=id;
        this.acc_Name=name;
        
    }
   
    public static void main(String[] args){
       Account a1=new Account(101,"Rahul");
       Account a2=new Account(102,"Sonia");
       Account a3=new Account(103,"Priyanka");


    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);

    
    System.out.println(a1.acc_Id);
    System.out.println(a2.acc_Id);
    System.out.println(a3.acc_Id);

    System.out.println(a1.acc_Name);
    System.out.println(a2.acc_Name);
    System.out.println(a3.acc_Name);

      

    }
}
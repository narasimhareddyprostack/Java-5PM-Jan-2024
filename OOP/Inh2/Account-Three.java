public class Account{
    int acc_Id;
    String acc_Name;
    public Account(int id, String name){
        System.out.println("Account class Constructor method");
    }
   
    public static void main(String[] args){
        new Account(101,"Rahul");
        new Account(102,"Sonia");
        new Account(103,"Priyanka");
      

    }
}
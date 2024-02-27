public class Account{
    public Account(){
        System.out.println("Account class Constructor method");
    }
    public void deposit_Amount(){
        System.out.println("Account class deposit Amount method");
    }
    public static void main(String[] args){
        new Account();
        new Account();
        new Account();
        new Account();
        new Account();
        new Account();

    }
}
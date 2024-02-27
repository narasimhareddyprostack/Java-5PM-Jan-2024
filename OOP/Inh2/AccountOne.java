public class Account{
    private int acc_Id;
    private String acc_Name;
    private int acc_Bal;
    //generate setters and getters
    public void set_acc_Id(int id){
        this.acc_Id = id;
    }
    public int get_acc_Id(){ 
        return this.acc_Id;
    }
    public void set_acc_Name(String name){
        this.acc_Name = name;
    }
    public String get_acc_Name(){
        return this.acc_Name;
    }
    public void deposit_Amount(int amount){
        this.acc_Bal = this.acc_Bal + amount;
    }
    public int get_Bal(){
        return this.acc_Bal;
    }
    public static void main(String[] args){
           Account a1=new Account();
           a1.set_acc_Id(101);
           a1.set_acc_Name("Rahul");
           a1.deposit_Amount(10000);
           a1.deposit_Amount(5000);
           a1.deposit_Amount(2000);

          System.out.println("Account Name:"+ a1.get_acc_Name() +"  and  Bal:"+ a1.get_Bal());
    }
}
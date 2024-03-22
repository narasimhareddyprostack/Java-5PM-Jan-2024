class Account{
    String acc_Name;
    String acc_Email;
    Account(String name,String email){
        this.acc_Name = name;
        this.acc_Email = email;
    }
}
class SA extends Account{
    int acc_Id;
    int acc_Bal;
    SA(int id, String name, String email, int amount){
        super(name, email);
        this.acc_Id = id;
        this.acc_Bal = amount;
    }
}
class Test{
    public static void main(String[] args){
        SA s1=new SA(101,"Rahul","rg@gmail.com",45000);
        SA s2= new SA(102,"Sonia","sg@gmail.com",55000);
        System.out.println(s1.acc_Name);
        System.out.println(s2.acc_Name);
    }
}
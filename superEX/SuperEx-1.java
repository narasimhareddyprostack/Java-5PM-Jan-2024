class Account{

}
class SA extends Account{
    SA(){
        System.out.println("SA class Constrctor");
    }
}
class CA extends Account{
     CA(){
        System.out.println("CA class Constrctor");
    }
}
class SuperEx{
    public static void main(String[] args){
        new SA();
        new CA();
    }
}
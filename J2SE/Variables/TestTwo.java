class Test{
    
    public void m1(){
        System.out.println("Test class m1 method");
    }
    public void m2(){
        System.out.println("Test class m2 method");
    }
    public static void m3(){
        System.out.println("Test class -static m3 method");
    }
    public static void main(String[] args){
      
       Test t1 =new Test();
       t1.m1();
       t1.m2();
       m3();
       Test.m3();
       

    }
}
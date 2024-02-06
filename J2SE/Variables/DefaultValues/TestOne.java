class Test{
    static int a=100;
    int b=200;
    int c=300;
   
    public static void main(String[] args){
       Test t1=new Test();

       System.out.println(a);
       System.out.println(t1.a);
       System.out.println(Test.a);
       
       Test t2=new Test();

    }
}
class Test{
   static int a=100;
    int b=10;
    int c=20;
    public static void main(String[] args){
       Test t1=new Test();
       System.out.println(t1.a+t1.b+t1.c);

       t1.c = 30;
       System.out.println(t1.a+t1.b+t1.c);
       
       Test t2=new Test();
       System.out.println(t2.a+t2.b+t2.c);

       t2.a = 101;
       t2.b = 11;
       System.out.println(t2.a+t2.b+t2.c);
       
    }
}
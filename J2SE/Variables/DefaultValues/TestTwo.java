class Test{
    static int a=100;
    int b=200;
    int c=300;
   
    public static void main(String[] args){
       Test t1=new Test();

      
       System.out.println(t1.a+t1.b+t1.c);
       
       Test t2=new Test();
       a = 101;
       t2.b = 201;
       System.out.println(t2.a+t2.b+t2.c);  //601
                         //101 + 200 + 300  

       System.out.println(t1.a+t1.b+t1.c);      
       //101 + 200 + 300 

    }
}
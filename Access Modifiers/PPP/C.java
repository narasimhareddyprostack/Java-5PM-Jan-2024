package pack2;
import pack1.A;
//import pack1.B; class B is  default access

class C{
    public static void main(String[] args){
       A obj=new A();
       obj.m1();
       //obj.m2();
       //obj.m3();
       obj.m4();
    }
}
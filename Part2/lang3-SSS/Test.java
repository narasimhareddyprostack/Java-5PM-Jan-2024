class Emp extends Object{}
class Test{
    public static void main(String[] args){
            int a=10;
            int b=10;

            Emp e1=new Emp();
            Emp e2=new Emp();
            System.out.println(e1);
            System.out.println(e2.toString());
            System.out.println(e1.equals(e2));
            System.out.println(e1 == e2);
            System.out.println(a == b);
    }
}
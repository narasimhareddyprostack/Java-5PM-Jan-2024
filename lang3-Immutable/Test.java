class Emp{}
class Test{
    public static void main(String[] args) {
        int a=100;
        Integer i=a;
        
        String s1=i;

        Emp e1=new Emp();

        System.out.println(a);
        System.out.println(i.toString());
        System.out.println(e1);
        System.out.println(s1);


    }
}
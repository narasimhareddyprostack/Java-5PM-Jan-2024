class Emp{}
class Test{
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=10;
        String s1="Rahul";
        String s2=new String("Rahul");
        String s3="Gandhi";
        Emp e1=new Emp();
        Emp e2=new Emp();


        System.out.println(s1.equals(s2));  //true
        System.out.println(s1 == s2);  //false
        System.out.println(s1 == s3);  //false
        System.out.println(s1.equals(s3));  //false

    }
}
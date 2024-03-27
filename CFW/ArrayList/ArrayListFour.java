import java.util.ArrayList;

class Test{
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<Integer>();
        ArrayList<Integer> al2=new ArrayList<Integer>();

        al1.add(100);
        al1.add(200);
        al1.add(300);

        al2.add(400);
        al2.add(500);
        al2.add(600);

        al1.addAll(al2);
        System.out.println(al1);
        al1.removeAll(al2);
        System.out.println(al1);
        al1.clear();
        System.out.println(al1);
       
    }
}
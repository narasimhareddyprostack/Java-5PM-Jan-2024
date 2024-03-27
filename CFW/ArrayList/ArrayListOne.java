import java.util.ArrayList;
class Test{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        System.out.println(al); //[]
        //update or add new elements

        al.add(10);
        al.add("Rahul");
        al.add(10);
        System.out.println(al); //[10, Rahul, 10]

        //arrayList empty or not

        System.out.println(al.isEmpty());
        System.out.println(al.size());
        System.out.println(al.contains(100));

        //delete operation
        al.remove("Rahul");
        System.out.println(al);

    }
}
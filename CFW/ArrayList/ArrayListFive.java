import java.util.ArrayList;

class Test {
        public static void main(String[] args) {
           
        ArrayList<String> enames=new ArrayList<String>();
        System.out.println(enames);
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Modi");
        enames.add("Amith Shaw");
        System.out.println(enames);
        enames.set(1, "Sonai Gandhi");
        System.out.println(enames);
        }   
}

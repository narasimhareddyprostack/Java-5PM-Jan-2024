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
        //iterate ArrayList using - for loop and for-each

          /*   for(int i=0;i<=enames.size()-1; i++){
                System.out.println(enames.get(i));
        }
        */
        for(String ename:enames){
                System.out.println(ename);
        }

        }   
}


class Test{
        public static void main(String[] args){
            System.out.println("GM");
            try{
                int[] ids={101,102,103};
                String ename = "Rahul Gandhi";
                //String ename = null;
                System.out.println(10/1);
                System.out.println(ename.length());
                System.out.println(ids[30]);


            }
            catch(NullPointerException e){
                System.out.println(e.getMessage());
            }
            catch(ArithmeticException e){
                //System.out.println(10/2);
                System.out.println(e.getMessage());
            }
            catch(ArrayIndexOutOfBoundsException e){
                 System.out.println(e.getMessage());
            }
            System.out.println("GE");
        }
}
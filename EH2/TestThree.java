
class Test{
        public static void main(String[] args){
            System.out.println("GM");
            try{
                System.out.println(10/0);
            }
            catch(NullPointerException e){
                System.out.println(10/1);
            }
             catch(ArithmeticException e){
                System.out.println(10/2);
            }
            System.out.println("GE");
        }
}
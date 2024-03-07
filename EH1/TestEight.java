class Test{
    public static void main(String[] args){
       
       int[] eIds={101,102,103,104};
       String[] eNames={"Rahul","Sonai"};
       System.out.println(eIds[0]);
       try{
                System.out.println(eIds[10]);
       }
       catch(Exception e){
                System.out.println(eIds[1]);
       }
       
       
       System.out.println(eIds[2]);
       System.out.println(eIds[3]);
       
    }
}
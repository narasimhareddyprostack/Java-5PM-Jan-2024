class Test{
    public static void main(String[] args){
        try{
            //Risky Code
            String ename = null;
            System.out.println(ename.length());
        }
        catch(Exception e){
                //Handling Code
        }
    }
}
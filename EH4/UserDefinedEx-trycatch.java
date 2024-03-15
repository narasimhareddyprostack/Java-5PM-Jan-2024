class LBException extends Exception{
    LBException(String msg){
        super(msg);
    }
}

class Test{
    public static void main(String[] args){
        try{
            throw new LBException("Less Bal");
        }
        catch(LBException lbe){
            System.out.println(lbe.getMessage());
        }
      
        System.out.println("GE");
    }
}
class LBException extends Exception{
    LBException(String msg){
        super(msg);
    }
}

class Test{
    public static void main(String[] args) throws LBException {
        
        throw new LBException("Less Bal");
        
      
        //System.out.println("GE");
    }
}
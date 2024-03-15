class LBException extends Exception{
    LBException(String msg){
        super(msg);
    }
}

class Test{
    public static void main(String[] args){
        //System.out.println(10/0);
        //throw new ArithmeticException("Can't Divide by Zero");
        throw new LBException("Less Bal");
        //System.out.println("GE");
    }
}
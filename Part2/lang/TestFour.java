class Test{
    public String toString(){
        return   Integer.toHexString(hashCode());
    }
    public static void main(String[] args){
        Test t1=new Test();
        System.out.println(t1);
        System.out.println(t1.toString());
    }

}
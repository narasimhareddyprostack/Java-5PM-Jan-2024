class Test{
    public static void main(String[] args) {
       //String to Primitive Data Type
        String s1="100";
        //String s2="Ten";
        String s3="45000.050";
      

        int a = Integer.parseInt(s1);
        //int b = Integer.parseInt(s2);
        float sal=Float.parseFloat(s3);
       
        System.out.println(a);
        //System.out.println(b);
        System.out.println(sal);
    }
}
class Test{
    public static void main(String[] args) {
        int a=100;
        //Integer i  = a;  //autoboxing
         Integer i= Integer.valueOf(a);
         Float   f = Float.valueOf(a);
        System.out.println(a);
        System.out.println(i);
        System.out.println(f);

    }
}
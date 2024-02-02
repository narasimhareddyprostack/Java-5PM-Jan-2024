class Test{
    public static void main(String[] arags){
        int[] eids = {201,202,203,204};
        String[] enames={"Rahul","Sonia","Priya","Modi","Rahul","Sonia","Priya","Modi"};

        //iterate array using for,while,for-each

        for(String ename:enames){
            System.out.println(ename);
        }
/* 
        int i=0;
        while(i<=enames.length-1){
            System.out.println(enames[i]);

            i++;
        } */
       /*  for(int i=0;i<=enames.length-1;i++){
            System.out.println(enames[i]);
        } */
    }
}
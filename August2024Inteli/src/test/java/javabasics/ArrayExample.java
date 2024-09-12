package javabasics;

public class ArrayExample {
    public static void main(String[] args) {
        // same datatype   int []a = {10,20,30.9, 40}; not working
        int []a = {10,20,30, 40}; // 0,1,2,3
        String [] name ={"limit", "LIMIT", "LimIT"};

      /*  System.out.println(a[0]);
        System.out.println(a[2]);
        System.out.println(a[3]);
      //  System.out.println(a[4]);// ArrayIndexOutOfBoundsException
        System.out.println(name[0]);
        System.out.println(name[2]);*/

        for (int j = 0; j<a.length; j++){
            System.out.println(a[j]) ;
        }

        for (int k= 0; k < name.length; k++){
            System.out.println(name[k]) ;

        }
    }
}

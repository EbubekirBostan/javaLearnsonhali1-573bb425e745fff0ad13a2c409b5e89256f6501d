package Day06;

import java.util.Scanner;

public class Q05_NestedForLoop {
    public static void main(String[] args) {
/*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("satır giriniz");
        int num1=sc.nextInt();
        System.out.println("sütun giriniz");
        int num2=sc.nextInt();
        for (int i = 1; i <=num1 ; i++) {
            for (int j = 1; j <=num2 ; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }








    }
}

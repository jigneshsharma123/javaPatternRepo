import java.util.Scanner;

class RightTriangle {
    
    //Right Triangle Pattern
    public static void PrintRightTriangle(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i>=j) {
                    System.err.print("* ");
                } else {
                    System.out.print("");
                }
            }
            System.err.println();
        }
    }
    // Inverted Right Triangle pattern
    public static void InvertedRightTriangle(int n ) {
     for(int i = n; i>=1; i--) {
        for(int j = 1; j <= n; j++) {
            if(i>=j) {
                System.out.print("*");
            } else {
                System.err.print(" ");
            }
        }
        System.out.println();
     }
   
    }
    //Inverte left trigangle
    public static void InvertedLeftTriangle(int n) {
       for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i>=j) {
                    System.err.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.err.println();
        }
    }
    public static void LeftTriangle(int n) {
        for(int i = 1; i <=n; i++) {
            //for space 
            for(int j = n - 1; j>=i; j--) {
                System.out.print("");
            }
            //for * 
            for(int k=1; k<=i;k++) {
                System.out.print("*"); //just add the white space after start to convert the pyramid pattern 
            }
          System.err.println();
        }

    }
    
    
    public static void main(String[] args) {

    try {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the pattern: ");
         int n = sc.nextInt();
        InvertedRightTriangle(n);
/*  
 
                    *****
                    ****
                    ***
                    **
                    *


 */

        System.out.println();
        InvertedLeftTriangle(n);
        /*   
         
        
 ****
  ***
   **
    *

         */
        System.out.println();
        PrintRightTriangle(n);

    /*
*     for(int j = 0;   (j<=i); j++)  j<=i ==> is important for printing this pattern for reverse this you simply i = 5 i >0 i--
* *
* * *
* * * *
* * * * * 
     */


        System.out.println();

  /*
   
*
**
***
****
    
   */


        LeftTriangle(4);


        } catch (Exception e) {
        System.out.println(e);
    }
    // 
    }
}
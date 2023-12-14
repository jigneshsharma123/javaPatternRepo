
import java.util.*;
public class PyramidPattern {



    public static void printPyramid(int n) {
          int px = n;
          int py = n;
       for(int i = 1; i <= n; i++) {
        for(int j = 1; j <=(n*2-1); j++) {
           if(j >= px && j <= py) {
              System.out.print("*");
           } else {
            System.err.print(" ");
           }
        }
        px--;
        py++;
        System.err.println();
       }
           

    }
  public static void printReversePyramid(int n) {
    int px = 1;
    int py = n * 2 - 1 ;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= (2 * n - 1); j++) {
            if(j >= px && j <=py) {
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
        px++;
        py--;
        System.out.println();
    }
  }






 public static void main(String[] args) {
     try {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the length of the pattern:");
       int n = sc.nextInt();
       printPyramid(n); System.out.println();
         printReversePyramid(n);
        
     } catch (Exception e) {
        System.out.println(e);
    }




 }    

}

/*
  

    *
   ***
  *****
 *******
*********

*********
 *******
  *****
   ***
    *
 */

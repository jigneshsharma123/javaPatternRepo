import java.util.Scanner;
public class CombinedPyramid {
   public static void printPyramid(int n) {
     int px = n;
     int py = n;
     for(int i = 1; i<n; i++) {
        for(int j = 1; j <= (2*n-1); j++) {
            if(j >= px && j<=py) {
                System.out.print("*");
            }else {
                System.out.print(" ");
            }

        }
        px--;
        py++;
        System.out.println();
     }
   } 
  public static void printReversePyramid(int n) {
      int px = 1;
      int py = 2*n-1;
      for(int i = 1; i<=n; i++) {
        for(int j = 1; j <= (2*n-1); j++) {
            if(j >= px && j<=py) {
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
     public static void PrintCombinedPyramid(int n) {
        
        printPyramid(n);
        printReversePyramid(n);
     }








    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the pattern:");
            int n = sc.nextInt();
            PrintCombinedPyramid(n);

        } catch (Exception e) {
          System.err.println(e);
        }
    }
}

/*
 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

 */
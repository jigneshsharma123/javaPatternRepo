import java.util.Scanner;
public class webkulPattern {
    
  public static void PrintWebkulPattern1(int n) {
    
    int px = 1;
    int py =n;
    for(int i = 1; i <= n / 2 + 1; i++) {
       
        //this is for the space means displacing the pyramid to the end of the row; of the opposite U ***  
        for(int j =1; j<=n/2; j++) {
            System.out.print(" ");
        }

        for(int j = 1; j<=n; j++) {
            if(j>=px && j<=py) {
                System.out.print("@");
            } else {
                System.out.print(" ");
            }
        }
        px++;
        py--;
        System.out.println();
    
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || j == 0 || j == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println(); // Move to the next line after each row
    }
   
}
    public static void main(String[] args) {

     try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Pattern:");
        int n = sc.nextInt();
        if(n % 2 != 0 && n !=1 && n > 1) {

            PrintWebkulPattern1(n);
        } else {
            System.out.println("Enter the vaild pattern size!");
        }

     } catch (Exception e) {
        System.err.println(e);
    }


    }
}

/*
 *   int px = 1;
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



  @@@@@
   @@@
    @
*****
*   *
*   *
*   *
*   *
 */
/**
 * webkulPattern3
 */
public class webkulPattern3 {

    public static void main(String[] args) {
        int n = 5;
        int x = (n + n + n) - 2;
        for(int i = 1; i <= n; i++) {
             for(int j = 0; j < i; j++) {
                System.out.print("*");
             }
             if(i == n) {
                for(int k = 0; k < x; k++) {
                    System.out.print("@");
                }
                x-=2;
             } else {
                for(int k = 0; k < x; k++) {
                System.out.print(" ");
                }
                x-=2;
             }
             for(int j = 0; j < i; j++) {System.out.print("*");}

            System.out.println();
        } //end of the first part of  the program; 
        for(int i = 1; i<=n; i++) {
             //this is for the spacing or /moving the pattern to the n == 3 space
             for(int j =0; j < n; j++) {
                System.out.print(" ");
            }
           for(int j = 0; j < n; j++) {
            System.out.print("@");
           }
           System.out.println();
        }
        //end of the second pattern @
        int px = 1;
        int py = n;
        for(int i = 1; i <(n/2)+2; i++) {
            //for the space 
            for(int k =0; k < n; k++) {
                System.out.print(" ");
            }
            for(int j =1; j<=n; j++) {
                if(j>=px && j<=py) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            px++;
            py--;
            
            System.out.println();
        }
    }
}
/*
 * 
 * 
 * 
 * 
 * 

*             *
**           **
***         ***
****       ****
*****@@@@@*****
     @@@@@
     @@@@@
     @@@@@
     @@@@@
     @@@@@
     *****
      ***
       *

 */
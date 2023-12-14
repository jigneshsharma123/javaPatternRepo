public class webkulPattern2 {

    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < (n/2)+2; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            //printing the @
            for(int j = 0; j < (2 * i + 1); j++) {
                System.out.print("@");
            }
         System.out.println();
        } //end of the pyramid 
      for(int i = 0; i < n; i++) {
          for(int j = 0; j < (n/2)+1; j++) {
            if(j>=n/2-i && j>= i - n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
          } //end of the left part of the patten
          //now it's time to print the @ symbol
          for(int j = 0; j < n; j++) {
            if( i == n / 2) {
                System.out.print("@");
            } else {
                System.out.print(" ");
            }
          }
          for(int j=0; j< (n/2) + 1; j++) {
            if( j >= n / 2 - i && j >= i - n / 2) {
                System.out.print("*");
            }
          }
          System.out.println();
      }
    }
}
/*
 * 
 *   @
    @@@
   @@@@@
  @@@@@@@
  *     *
 **     **
***@@@@@***
 **     **
  *     *

 * 
 */
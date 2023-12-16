public class webkulPattern6 {
    public static void main(String[] args) {
        int n = 5;

        // First part of the pattern
        for (int i = 0; i < n / 2 + 1; i++) {
           
            for(int space = 0; space < n/2; space++) {
                System.out.print(" ");
            }
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
          
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second part of the pattern
        for (int i = 2; i < n  ; i++) { // i start from 2 bcoz i want to print only n - 2 @ symbol 
           //this is for the space 
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
               
                    if (j == 0 || j == n - 1) {
                        System.out.print("@");
                    } else {
                        System.out.print(" ");
                    }
                
            }
            System.out.println();
        }

        // Third part of the pattern
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (j < i) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n - (2 * i); j++) {
                System.out.print("*");
            }
            
            for (int j = 0; j < n / 2; j++) {
                if (j < i) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i == 0 && (j == 0 || j == n - 1)) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n / 2; j++) {
                if (j < i) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n - (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
       *
      ***
     *****
     @   @
     @   @
     @   @
*****@   @*****
 ***       ***
  *         *
 
 
  */

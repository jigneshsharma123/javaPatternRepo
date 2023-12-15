public class webkulPattern4 {
    public static void main(String[] args) {
        int n = 9;
        for(int i = 0; i  < n; i++) {
            for(int j = 0; j<n; j++) {
                if((i < n / 2 && j<=i) || (i == n / 2) || (i > n / 2 && j<n-i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            } 
            if(i == n / 2 - 1 || i == n / 2 + 1 ) {
                System.out.print(" *");
                }
                if( i == n / 2) {
                    System.out.print("***");
                }
            System.out.println();
        }

    }
}

/*
 * 
 *   (i < n / 2 && j<=i) this is for the upper left part
 *   (i > n / 2 && j<n - i) this is for the lower left part 
 *   (i == n / 2)  this is for the star present in the center of the pattern
 *   if( i == n / 2 - 1 ) this is for the middle - 1 which print single space + star 
 *   if(i == n / 2 + 1) this is for the middle + 1 which print single space + star
 *     
 * 
 */
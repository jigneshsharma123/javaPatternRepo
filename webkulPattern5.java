public class webkulPattern5 {
   
    public static void main(String[] args) {
         int n = 6;
    for(int i = 0; i < n * 2 ; i++) {
        if(i < n + 1) {
            System.out.print("@");

        } else {
            System.out.print(" ");
        }
        for(int j = 0; j < (n*(n-1) + 1); j++) {
           if(i >= n / 2 && i < 2 * n - n /2) {
            System.out.print("*");
           } else {
            System.out.print(" ");
           }
        }

        if(i >= n - 1) {
            System.out.print("@");
        } else {
            System.out.print(" ");
        }
        System.out.println();
    }
    }
    
}

/*
 * 
 *   if int n = 6 then col = n * (n - 1) + 1 ==> 31
 *   if int n = 6 then row = n * 2 ===> 12;
 *   if(i < n + 1) print "@" else print " "
 *     if(i <= n / 2 && i < 2 * n - n / 2) print * else print " "        (2*n - n / 2) ==> 9 
 *   if(i >= n - 1) print "@" else print " "
 */
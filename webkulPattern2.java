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

    }
}
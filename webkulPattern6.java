public class webkulPattern6 {
    public static void main(String[] args) {
        int n = 5;

        // First part of the pattern
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second part of the pattern
        for (int i = 0; i < n - 2; i++) {
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
        for (int i = 0; i <= n / 2; i++) {
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


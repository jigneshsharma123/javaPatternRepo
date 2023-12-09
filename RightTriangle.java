import java.util.Scanner;

class RightTriangle {
    
    
    public static void PrintRightTriangle(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i>=j) {
                    System.err.print("* ");
                } else {
                    System.out.print("");
                }
            }
            System.err.println();
        }
    }
   

    
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the pattern: ");
     int n = sc.nextInt();
    PrintRightTriangle(n);
    }
}
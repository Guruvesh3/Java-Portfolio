import java.util.*;
public class hollow_retangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows and columns: \n");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        for(int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if(i == 1 || j == 1 || i == rows || j == columns) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
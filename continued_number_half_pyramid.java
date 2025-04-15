import java.util.*;
public class continued_number_half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int num1 = 1;
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num1 + " ");
                num1++;
            }
            System.out.println();
        }
        sc.close();
    }
}
import java.util.*;
public class number_half_inverted_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
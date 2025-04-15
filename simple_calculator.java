import java.util.*;
public class simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operation: \n");
        System.out.print("1 : + \n");
        System.out.print("2 : - \n");
        System.out.print("3 : * \n");
        System.out.print("4 : / \n");
        System.out.print("Enter you choice: ");
        int choice = sc.nextInt();
        int a = num1 + num2;
        int b = num1 - num2;
        int c = num1 * num2;
        int d = num1 / num2;
        switch (choice) {
            case 1 : System.out.print("The addition is: " + a);
            break;
            case 2 : System.out.print("The subtraction is: " + b);
                break;
            case 3 : System.out.print("The multiplication is: " + c);
                break;
            case 4 : System.out.print("The division is: " + d);
                break;
            default : System.out.print("This calculator is designed for simple calculations.");
        }
        sc.close();
    }
}

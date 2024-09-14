import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int AGE_lIMIT = 18;
       
        System.out.println("Enter your name:");
        int age = scanner

        if (age >= 18) {
            System.out.println("Access granted");
        }
        
        if (age < 18) {
            System.out.println("Access denied");
        }
    }
}

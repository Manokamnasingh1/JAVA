
import java.util.*;

public class Switch {
    public static void main(String[] args) {

        char operator;
        Double a, b, c;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        a = input.nextDouble();

        System.out.println("Enter second number");
        b = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                c= a + b;
                System.out.println(a + " + " + b + " = " + c);
                break;

            // performs subtraction between numbers
            case '-':
                c = a- b;
                System.out.println(a + " - " + b + " = " + c );
                break;

            // performs multiplication between numbers
            case '*':
                c = a* b;
                System.out.println(a + " * " + b + " = " + c);
                break;

            // performs division between numbers
            case '/':
                c = a/ b;
                System.out.println(a + " / " + b + " = " + c);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}
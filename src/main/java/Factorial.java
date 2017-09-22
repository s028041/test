import java.util.Scanner;
import java.math.*;

public class Factorial {
    public static void main(String[] args) {

        Somemath test = new Somemath();

        Scanner userinput = new Scanner(System.in);

        System.out.print("Enter the number to find factorial: ");

        int num = userinput.nextInt();

        System.out.println("The factorial of " +num+" is: "+test.fact(num));

    }

}

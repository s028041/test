import org.joda.time.*;
import java.util.Scanner;

class Hellothere extends Vardas {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vardas firstObject = new Vardas();

        System.out.println("Enter your name here: ");
        String name = input.nextLine();

        firstObject.simpleMessage(name);


    }
}

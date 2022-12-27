
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int resp1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number: ");
        int resp2 = Integer.valueOf(scan.nextLine());

        if (resp1 > resp2) {
            System.out.println("Greater number is: " + resp1);
        } else if (resp1 < resp2) {
            System.out.println("Greater number is: " + resp2);
        } else if (resp1 == resp2) {
            System.out.println("The numbers are equal!");
        }
    }
}

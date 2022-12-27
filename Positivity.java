
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number: ");
        int resp = Integer.valueOf(scan.nextLine());

        if ( resp <= 0 ) { 
            System.out.println("The number is not positive. ");
        }

        if ( resp > 0 ) {
            System.out.println("The number is positive. ");
        }
    }
}

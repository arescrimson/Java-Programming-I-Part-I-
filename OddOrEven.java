
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int r = Integer.valueOf(scan.nextLine()); 

        if ( r % 2 == 0 ) {
            System.out.println("Number " + r + " is even.");
        } else if ( r % 2 != 0) { 
            System.out.println("Number " + r + " is odd5.");
        }
    }
}


import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you? ");
        int resp = Integer.valueOf(scan.nextLine());
        
        if ( resp >= 18) {
            System.out.println("You are an adult");
        }
        if ( resp < 18) {
            System.out.println("You are not an adult");
        }
    }
}

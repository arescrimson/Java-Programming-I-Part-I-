
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number: ");
        int resp = Integer.valueOf(scan.nextLine());


        if (resp == 1984) {
            System.out.println("Orwell");
        }


        if (resp != 1984) {
            System.out.println("");
        } 


    }
}

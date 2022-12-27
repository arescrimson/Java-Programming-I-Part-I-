
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year: ");
        int resp = Integer.valueOf(scan.nextLine()); 

        if(resp < 2015) {
            System.out.println("Ancient History! ");
        }
    }
}

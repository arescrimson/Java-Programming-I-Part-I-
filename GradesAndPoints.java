
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]: ");
        int g = Integer.valueOf(scan.nextLine());

        if (g < 0 ) { 
            System.out.println("impossible!");
        } else if (g == 0 || g <= 49) { 
            System.out.println("failed");
        } else if (g >=50 && g <=59) {
            System.out.println("1");
        } else if (g >=60 && g <=69) {
            System.out.println("2");
        } else if (g >=70 && g <=79) {
            System.out.println("3");
        } else if (g >=80 && g <=89) {
            System.out.println("4");
        } else if (g >=90 && g <=100) {
            System.out.println("5");
        } else if (g > 100) {
            System.out.println("incredible!");
        }
    }
}


import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int r = Integer.valueOf(scan.nextLine());

        if(r > 5000) {
       
            if (r >= 5000 && r < 25000) {
            double gift = (100+(r-5000) * 0.08);
            System.out.println("Tax: " + gift);
            
        } 

        
            if (r >= 25000 && r < 55000) {
            double gift = (1700+(r-25000) * 0.1);
            System.out.println("Tax: " + gift);
            
        }

            if (r >= 55000 && r < 200000) {
            double gift = (4700+(r-55000) * 0.12);
            System.out.println("Tax: " + gift);
            
        }

            if (r >= 200000 && r < 1000000) {
            double gift = (22100 + (r - 200000) * 0.15);
            System.out.println("Tax: " + gift);
            
        }

            if (r >= 1000000) {
            double gift = (142100+ (r-1000000) * 0.17);
            System.out.println("Tax: " + gift);
            
        }

    } else { 
        System.out.println("No tax!");
    }
        
        
    }
}

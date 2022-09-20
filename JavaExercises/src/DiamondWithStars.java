
import java.util.Scanner;

public class DiamondWithStars {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        /*
        *
        * while(true) {

            if(number % 2 == 1) break;
            System.out.println("");
        }
        * */

        System.out.print("Please enter a odd number: ");
        n = input.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }



    }


}

import java.util.Scanner;

public class CalculateTax {


    public static void main(String[] args) {


        /* Get product price
        *  calculate tax %18
        *  show price with tax
        *
        */



        Scanner input = new Scanner(System.in);
        float price , tax;

        System.out.print("Please enter product price: ");
        price = input.nextFloat();

        tax = (price / 100) * 18;

        System.out.print("Price:  " + (tax + price) + " | " + "Tax: " + tax);









    }

}

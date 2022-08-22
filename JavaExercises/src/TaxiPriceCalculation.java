import java.util.Scanner;



public class TaxiPriceCalculation {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    float taxiPrice;

    System.out.println("1 kilometer price: 2.2$");


    System.out.print("Please enter kilometer: ");
    taxiPrice = input.nextFloat();
    if(taxiPrice < 5) {
        System.out.println("You have to pay: 20$");
    } else {
        System.out.println("You have to pay: " + (taxiPrice * 2.2) + "$");
    }










}


}

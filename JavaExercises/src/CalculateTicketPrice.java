import java.util.Scanner;



public class CalculateTicketPrice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age, typeOfTrip, distance,  discount=0;
        double ticketPrice;



        System.out.println("Welcome to the Aykut Travel");

        System.out.print("Please enter type of trip, 'one time' to press 1, 'round trip' to press 2 : ");
        typeOfTrip = input.nextInt();

        System.out.print("Please enter your age: ");
        age = input.nextInt();

        System.out.print("Please enter distance: ");
        distance = input.nextInt();

        if((age >= 1) && (typeOfTrip == 1  || typeOfTrip == 2) && (distance >= 1)) {



            if(typeOfTrip == 2) {
                discount += 20;
            }

            if(age<12){
                discount += 50;
            }

            else if(age>=12 && age<= 24) {
                discount += 10;
            }

            else if(age > 65) {
                discount += 30;
            }

            ticketPrice = distance * 0.1;

            ticketPrice -= ((ticketPrice/100) * discount);

            System.out.println("Your ticket price is: " + ticketPrice + "$");

        }else {

            System.out.println("You entered wrong value.");


        }





    }



}

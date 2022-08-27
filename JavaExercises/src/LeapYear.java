import java.util.Scanner;


public class LeapYear {

    public static void main(String[] args) {
        int date;

        Scanner input = new Scanner(System.in);



        System.out.println("Welcome to the Leap Year Program...");

        System.out.print("Please enter a year: ");
        date = input.nextInt();


        if(date % 4 == 0) {

            if(date % 100 == 0 && date % 400 != 0) {
                System.out.println("Not Leap");
            }else {
                System.out.println("Leap year");
            }


        }else {
            System.out.println("Not Leap");
        }









    }



}

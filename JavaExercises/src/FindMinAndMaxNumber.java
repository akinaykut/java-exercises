import java.util.Scanner;


public class FindMinAndMaxNumber {


    public static void main(String[] args) {
        int countOfNumber = 0, number = 0, mostBig=0, mostSmall= 0;

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter do you have how many number?");
        countOfNumber = input.nextInt();

        System.out.println("Please enter your numbers");

        for( int i = 1 ; i<= countOfNumber; i++) {

            number = input.nextInt();
            System.out.println(i + ". number : " +  number);

            if(number > mostBig) {
                mostBig = number;
            }
            if(number < mostSmall) {
                mostSmall = number;
            }

        }

        System.out.println("Most Big number is: " + mostBig);
        System.out.println("Most Small number is: " + mostSmall);

    }




}

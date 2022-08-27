import java.util.Scanner;


public class SumOfNumbers {

    public static void main(String[] args) {
        int number, sum=0;
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter a number: ");
        number = input.nextInt();


        while(true) {
            if(number<10) {
                sum += number;
                break;
            }else {

                sum += number % 10;
                number = number / 10;
            }
        }

        System.out.println("Sum of numbers: " + sum);

    }


}

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {
        int number, firstNumber= 0, secondNumber= 1, temp = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        number = input.nextInt();
        System.out.println(firstNumber);
        for(int i = 0; i<number; i++) {

            temp = secondNumber;
            secondNumber = firstNumber + secondNumber;
            firstNumber = temp;
            System.out.println(firstNumber );
        }







    }
}

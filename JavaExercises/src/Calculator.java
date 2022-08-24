import java.util.Scanner;

public class Calculator {


    public static  void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double firstNumber , secondNumber;
        char operation;

        System.out.println("Welcome to the Calculator");
        System.out.print("Please enter first number: ");
        firstNumber = input.nextDouble();

        System.out.print("Please enter second number: ");
        secondNumber = input.nextDouble();

        System.out.print("Please enter \n/ to divide\n* to multiply\n- to subtract\n+ to sum  ");
        operation = input.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Sum: " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Subtract: " + (firstNumber - secondNumber));
                break;
            case '/':
                System.out.println("Divide: " + (firstNumber / secondNumber));
                break;
            case '*':
                System.out.println("Multiply: " + (firstNumber * secondNumber));
                break;

            default:
                System.out.println("Wrong value entered!!!");
        }





    }


}

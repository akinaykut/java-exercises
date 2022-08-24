import java.util.*;

public class SortNumbers {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, number3, mostBig, mostSmall;

        System.out.println("Welcome to the sorting number app");

        System.out.print("Please enter first number: ");
        number1 = input.nextInt();

        System.out.print("Please enter second number: ");
        number2 = input.nextInt();

        System.out.print("Please enter third number: ");
        number3 = input.nextInt();


        if ((number1 > number2) && (number1 > number3)) {
            if (number2 > number3) {
                System.out.println("number1 > number2 > number3");
            } else {
                System.out.println("number1>number3>number2");
            }
        }else if((number2>number1) && (number2>number3)) {
            if(number1>number3) {
                System.out.println("number2 > number1 > number3");
            }else {
                System.out.println("number2 > number3 > number1");
            }
        }else {
            if(number2>number1) {
                System.out.println("number3 > number2 > number1");
            }else {
                System.out.println("number3 > number1 > number2");
            }
        }

    }
}

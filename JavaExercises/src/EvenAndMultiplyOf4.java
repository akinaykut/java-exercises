import java.util.Scanner;

public class EvenAndMultiplyOf4 {


        public static void main(String[] args) {
            int number, sum=0;

            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.print("Please enter a odd number: ");
                number = input.nextInt();
                if(number % 2 == 1) {
                    break;
                }
                System.out.println();
            }

            for(int i = 0; i<number; i++) {

                if(i % 4 == 0 ) sum += i;
            }

            System.out.println("Sum: " + sum);
        }


    }



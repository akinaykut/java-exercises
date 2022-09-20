import java.util.Scanner;

public class FindPrimeNumber {

    public static boolean PrimeNumber(int number) {
        int count = 0;
        for(int i = 1; i<number; i++) {
            if(number % i == 0) count++;
        }

        if(count == 1) return true;
        else return false;

    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("All prime numbers from 2 to 100");

        for(int i = 2; i<100; i++) {

            if(PrimeNumber(i)) System.out.print(i + ", ");

        }



    }

}

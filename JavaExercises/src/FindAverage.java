import java.util.Scanner;


public class FindAverage {

    public static void main(String[] args) {

        int number, count=0;
        double average=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        number = input.nextInt();

        for(int i = 1; i< number; i++) {

            if(i % 3 == 0 || i % 4 == 0) {
                count++;
                average += i;
                System.out.print(i + " ");
            }

        }

        average /= count;

        System.out.println("Average: " + average);



    }



}

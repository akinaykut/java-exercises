import java.util.Scanner;

public class FindBodyMassIndex {

    public  static  void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double bodyMassIndex, weight, height;


        System.out.print("Please enter your height: ");
        height = input.nextFloat();

        System.out.print("Please enter your weight: ");
        weight = input.nextDouble();

        bodyMassIndex = weight / (Math.pow(height, 2));

        System.out.println("Your body mass index: " + bodyMassIndex);

    }


}

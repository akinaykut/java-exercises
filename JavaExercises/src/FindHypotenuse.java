import java.util.Scanner;

public class FindHypotenuse {

public static void main (String[] args) {





     /*
     *  Get 2 edge of triangle and then calculate hypotenuse
     *
     *  hypotenuse^2 = a^2 + b^2;
     *
     *
     *
     *
     * */

    Scanner input = new Scanner(System.in);

    double a, b, hypotenuse;

    System.out.print("Please enter value one of edge: ");
    a = input.nextDouble();

    System.out.print("Please enter other value of edge: ");
    b = input.nextDouble();

    hypotenuse = Math.sqrt(Math.pow(a,2) +Math.pow(b,2));

    System.out.println("Hypotenuse: " + hypotenuse);

}


}

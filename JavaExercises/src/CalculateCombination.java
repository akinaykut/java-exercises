import java.util.Scanner;


public class CalculateCombination {

    public static int factorial(int number) {
        int factorial= 1;
        if(number== 0 || number == 1) return 1;
        for(int i = 1; i<=number; i++) {
            factorial *= i;
        }

        return factorial;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, r, combination;
        //C(n,r) = n! / (r! * (n-r)!)

        System.out.print("Please enter value of n: ");
        n = input.nextInt();

        System.out.print("Please enter value of r: ");
        r = input.nextInt();

        combination = factorial(n) / (factorial(r) * factorial(n-r));

        System.out.print("Combination C(" + n + "," + r +"): " + combination);

    }


}

import java.util.Scanner;

public class PowRecursive {

    static int getPow(int num1, int num2) {

        if(num2 == 0) {
            return 1;
        }

        return getPow(num1, num2-1) * num1 ;

    }


    public static void main(String[] args) {
        int num1, num2 ;
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter a number: ");
        num1 = input.nextInt();

        System.out.print("Please enter a number: ");
        num2 = input.nextInt();

        System.out.println(getPow(num1, num2));








    }



}

import java.util.Scanner;

public class RecursiveMethod {

    static void recursiveMethod(int number) {
        System.out.println(number);
        if(number < 1) {
            return ;
        }

         recursiveMethod(number - 5);
        System.out.println(number);
        return ;

    }

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        number = input.nextInt();

        recursiveMethod(number);


    }




}

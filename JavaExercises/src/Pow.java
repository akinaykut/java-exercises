import java.util.Scanner;


public class Pow {

    public static void main(String[] args) {
        int number, pow = 1, multiply;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number: ");
        number = input.nextInt();

        System.out.print("Please enter multiply number: ");
        multiply = input.nextInt();

        for(int i = 0; i<multiply; i++) {
            if(multiply == 0) {
                System.out.println("Pow(" + number + "," + multiply + "): " + pow);
            }else{
                pow *= number;
            }



        }

        System.out.println("Pow(" + number + "," + multiply + "): " + pow);


    }


}

import java.util.Scanner;

public class PerfectNumberRecursive {


    static void isPerfectNumber(int number1, int number2, int count) {

        if(number1 % number2 == 0) {
            count++;
            if(count>2){
                System.out.println("Asal değildir...");
                return;
            }

        }

        if(number2 == 1 && count == 2) {
            System.out.println("Asaldir...");
            return;
        }


        isPerfectNumber(number1, number2 - 1 , count);


    }




    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);


        isPerfectNumber(17, 17, 0);





    }


}

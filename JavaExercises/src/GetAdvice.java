import java.util.Scanner;

public class GetAdvice {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int degree;

        System.out.print("Please enter degree to get advice: ");
        degree = input.nextInt();


        if (degree < 5) {
            System.out.println("Go to Hell");
        } else if(degree >= 5 && degree < 15) {
            System.out.println("Go to cinema");

        }else if(degree >= 15 && degree < 25) {
            System.out.println("Go to picnic");
        } else if ( degree >= 25) {
            System.out.println("Go to swim");
        } else {
            System.out.println("There is not advice for you");
        }

    }
}
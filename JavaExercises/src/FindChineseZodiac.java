import java.util.Scanner;

public class FindChineseZodiac {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int birthDate ;


        System.out.println("Welcome to the Chinese Zodiac Program...");

        System.out.print("Please enter your birth date as a year: ");
        birthDate = input.nextInt();

        birthDate = birthDate % 12;

        switch (birthDate) {

            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Rat");
                break;
            case 5:
                System.out.println("Bullock");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Ship");
                break;
            default:
                System.out.println("You entered wrong value!");
        }

    }

}

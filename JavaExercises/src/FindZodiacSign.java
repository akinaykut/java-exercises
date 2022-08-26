
import java.util.Scanner;

public class FindZodiacSign {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mounth, day;


        System.out.println("Welcome to the Zodiac Sign Program");

        System.out.print("Please enter your birth mounth as a number: ");
        mounth = input.nextInt();

        System.out.print("Please enter your birthday 'just day' as a number: ");
        day = input.nextInt();



        //Aries
        if ((mounth == 3 && day <= 31 && day >= 21) || (mounth == 4 && day <= 20 && day >= 1)) {
            System.out.println("Your zodiac sign is Aries");
        }

        //Taurus
        else if ((mounth == 4 && day <= 31 && day >= 21) || (mounth == 5 && day <= 21 && day >= 1)){
            System.out.println("Your zodiac sign is Taurus");
        }

        //Gemini
        else if((mounth == 5 && day <=31  && day >= 22) || (mounth == 6 && day <= 22 && day >= 1)) {
            System.out.println("Your zodiac is Gemini");
        }

        //Crab
        else if((mounth == 6 && day <= 31 && day >= 23) || (mounth == 7 && day <= 22 && day >= 1)) {
            System.out.println("Your zodiac is Crab");
        }

        //Loe
        else if((mounth == 7 && day <= 31 && day >= 23) || (mounth == 8 && day <= 22 && day >= 1)){
            System.out.println("Your zodiac is Leo");
        }

        //Virgo
        else if((mounth == 8 && day <= 31 && day >= 23) || (mounth == 9 && day <= 22 && day >= 1)){
            System.out.println("Your zodiac is Virgo");
        }

        //Libra
        else if((mounth == 9 && day <= 31 && day >= 23) || (mounth == 10 && day <= 22 && day >= 1)){
            System.out.println("Your zodiac is Libra");
        }

        //Scorpion
        else if((mounth == 10 && day <= 31 && day >= 23) || (mounth == 11 && day <= 21 && day >= 1)){
            System.out.println("Your zodiac is Scorpion");
        }

        //Sagittarius
        else if((mounth == 11 && day <= 31 && day >= 22) || (mounth == 12 && day <= 21 && day >= 1)) {
            System.out.println("Your zodiac is Sagittarius");
        }

        //Capricorn
        else if((mounth == 12 && day <= 31 && day >= 22) || (mounth == 1 && day <= 21 && day >= 1)){
            System.out.println("Your zodiac is Capricorn");
        }

        //Aquarius
        else if((mounth == 1 && day <= 31 && day >= 22) || (mounth == 2 && day <= 19 && day >= 1)){
            System.out.println("Your zodiac is Aquarius");
        }

        //Pisces
        else if((mounth == 2 && day <= 28 && day >= 20) || (mounth == 3 && day <= 20 && day >= 1)){
            System.out.println("Your zodiac is Pisces");
        }

        //Handle Error
        else{
            System.out.println("You entered wrong date please don't do this anymore!");
        }
    }
    }
import java.util.Scanner;

import java.util.Scanner;
public class FiveAndFourMultiply {






        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int number, pow4= 1 , pow5 = 1 ;


            System.out.print("Please enter a number: ");
            number = input.nextInt();

            for(int i = 1 ; i<number; i++) {

                pow4 *= 4;
                pow5 *= 5;

                if(pow4<number) {
                    System.out.println("4 pow " + i + ": " + pow4);

                }else{
                    break;
                }

                if(pow5<number) {
                    System.out.println("5 pow " + i + ": " + pow5);
                }
                    else{
                    break;
                }

            }





        }


    }





import java.util.Scanner;

public class ShoppingApp {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        float sum = 0, userInput, apple, orange, grape, banana, watermelon;



        apple = 2f;
        orange = 0.76f;
        grape = 1.23f;
        banana = 3.4f;
        watermelon= 2.14f;



        System.out.println("Apple: " + apple + "$");
        System.out.print("Please enter 'How many kg do you want apple': ");
        userInput = input.nextFloat();
        sum = sum + (userInput * apple);

        System.out.println("Grape: " + grape + "$");
        System.out.print("Please enter 'How many kg do you want grape': ");
        userInput = input.nextFloat();
        sum = sum + (userInput * grape);

        System.out.println("Orange: " + orange + "$");
        System.out.print("Please enter 'How many kg do you want orange': ");
        userInput = input.nextFloat();
        sum = sum + (userInput * orange);

        System.out.println("Banana: " + banana + "$");
        System.out.print("Please enter 'How many kg do you want banana': ");
        userInput = input.nextFloat();
        sum = sum + (userInput * banana);

        System.out.println("Watermelon: " + watermelon + "$");
        System.out.print("Please enter 'How many kg do you want watermelon': ");
        userInput = input.nextFloat();
        sum = sum + (userInput * apple);

        System.out.println("You have to pay all of products: " + sum + "$");




    }


}

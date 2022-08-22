import  java.util.Scanner;


public class FindCircleAreaAndPerimeter {

    public  static void main(String[] args) {
        double PI = 3.14, r, perimeter, area;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your circle r: ");
        r = input.nextDouble();

        perimeter = PI * Math.pow(r,2);

        area = 2 * PI * r;


        System.out.println("Area: " + area + " cm");
        System.out.println("Perimeter: " + perimeter + " cm");

    }



}

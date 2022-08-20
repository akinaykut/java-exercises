import java.util.Scanner;

public class CalculatePassingGrade {

    public static void main(String[] args) {


        /*
        *  This program will calculate your passing grade note
        *  if you want to try yourself please don't look the solution.
        *
        *  if the average of the notes under 50 user should see "Failed"
        *  else "Congratulations"
        *
        */




        // The solution section
        Scanner input = new Scanner(System.in);

        int firstNote, secondNote, average;


        System.out.print("Please enter your first note: ");
        firstNote = input.nextInt();

        System.out.print("Please enter your second note: ");
        secondNote = input.nextInt();

        average = (firstNote + secondNote) / 2;
        System.out.println(average < 50 ? "Failed" : "Congratulations");
    }



}

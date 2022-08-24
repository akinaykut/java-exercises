import java.util.Scanner;

public class CompareUserInput {


    public static  void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username, password, newPassword, operator;


        System.out.print("Please enter username: ");
        username = input.nextLine();

        System.out.print("Please enter password: ");
        password = input.nextLine();

        System.out.println("Welcome to login page " + username);
        System.out.print("Please enter password to login : ");
        newPassword = input.nextLine();

        if(newPassword.equals(password)){
            System.out.println("Home sweet home...");
        }else {
            System.out.print("You entered wrong password. Please enter * to change password: ");
            operator = input.nextLine();
            if(operator.equals("*")) {
                System.out.print("Please enter new password: ");
                newPassword = input.nextLine();
                if(newPassword.equals(password) ) {
                    System.out.println("You can not change password with older password.");
                }else {
                    System.out.println("Password changed successfully");
                }

            }else {
                System.out.println("You entered different character have a good day.");
            }
        }

    }


}

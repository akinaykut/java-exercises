import java.util.Arrays;
import java.util.Scanner;
public class MineSweeper {

    int row;
    int column;
    int mines;

    String[][] mineField;
    String[][] copyMineField;


    MineSweeper(int row, int column) {

        this.row = row;
        this.column= column;
        this.mines = (row* column)/4;
        this.mineField = new String[row][column];
    }


    void run() {
        Scanner input = new Scanner(System.in);
        int row; int column;


        this.addMines();
        this.showMines();

        while(true) {

            System.out.print("Please enter row: ");
            row = input.nextInt();

            System.out.print("Please enter column: ");
            column = input.nextInt();

            if(this.mineField[row][column] == " * ") {
                System.out.println("You died.");
                break;

            }else {
                this.countMines(row, column);
                this.showMines();
            }

        }



    }







    void addMines() {

        for(int i = 0; i<this.row; i++) {
            for(int j = 0; j< this.column; j++) {
                this.mineField[i][j] = " - ";
            }
        }


        for(int i = 0 ; i<mines; i++) {

            int minesRow = (int) (Math.random() * row);
            int minesColumn = (int) (Math.random() * column);

            this.mineField[minesRow][minesColumn] = " * ";


        }



    }

    void showMines() {
        System.out.println("-------- MineField -----------");

        for (String[] i : this.mineField) {
            for (String u : i) {
                System.out.print(u);
            }
            System.out.println();
        }
        System.out.println("-------- MineField -----------");
    }

    void countMines(int row, int column) {
        int count = 0;

        int userRowStart = row - 1;
        int userRowEnd=  row + 1;
        int userColumnStart= column - 1;
        int userColumnEnd= column + 1;

        if(row == 0) userRowStart = 0;
        if(row == this.row) userRowEnd = row;
        if(column == 0) userColumnStart = 0;
        if(column == this.column) userColumnEnd = column;





        for(int i = userRowStart; i<= userRowEnd; i++) {
            for(int j = userColumnStart; j<= userColumnEnd; j++) {

                if(this.mineField[i][j] == " * ") {

                    count++;
                }

            }

        }

        this.mineField[row][column] = String.valueOf(" " + count + " ");


    }

    void copyField() {

        for(int i = 0; i<this.row; i++) {
            for(int j = 0; j< this.column; j++) {
                this.copyMineField[i][j] = this.mineField[i][j];
            }
        }

    }


}

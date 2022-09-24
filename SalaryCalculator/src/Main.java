import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee ahmet = new Employee("Ahmet", 1500, 45, 2020);

        ahmet.raiseSalary();
        ahmet.bonus();
        ahmet.tax();
        ahmet.print();


        int[] dizi1 = new int[10];

        for(int i =0 ; i< 10; i++) {
            dizi1[i]= i;
            System.out.print(dizi1[i]);
        }


        System.out.println();

        for( int i : dizi1) {
            dizi1[i] = 5;
            System.out.print(dizi1[i]);
        }

        int[][] dizi2 = new int[5][5];


        System.out.println();
        for(int[] u: dizi2) {
            for(int i : u) {
                u[i] = 0;
                System.out.print(u[i]);
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(dizi1));
    }

}

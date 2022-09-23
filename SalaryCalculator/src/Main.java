public class Main {
    public static void main(String[] args) {

        Employee ahmet = new Employee("Ahmet", 1500, 45, 2020);

        ahmet.raiseSalary();
        ahmet.bonus();
        ahmet.tax();
        ahmet.print();


    }

}

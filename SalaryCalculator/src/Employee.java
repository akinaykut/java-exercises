public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;


    Employee(String name, int salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = workHours;

    }

    void tax() {
        if(this.salary> 1000) {
            this.salary -= (this.salary / 100) * 3;
        }
    }

    void bonus() {
        if(this.workHours>40) {
            this.salary += (this.workHours - 40) * 30;
        }
    }

    void raiseSalary() {
        if((this.hireYear - 2021) <10) {
            this.salary += (this.salary / 100) *5;
        } else if((this.hireYear - 2021) < 20) {
            this.salary += (this.salary / 100) * 10;
        } else {
            this.salary += (this.salary / 100) * 15;
        }
    }
    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work hours: "+ this.workHours);
        System.out.println("Hire year: " + this.hireYear);
    }
}




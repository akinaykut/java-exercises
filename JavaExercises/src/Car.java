public class Car {

    String color;
    int speed;
    String model;

    Car() {
        System.out.println("yapici method calisti");
        this.color= "red";
    }


    Car(String model, int speed, String color) {

        this.model = model;
        this.speed = speed;
        this.color = color;

    }

    void increaseSpeed(int increase) {
        this.speed += increase;
    }



    public static void main(String[] args) {


        System.out.println("Hello World");
        Car audi = new Car();
        System.out.println(audi.color);

        Car mercedes = new Car("RaceCar", 180, "black");

        System.out.println(mercedes.speed);
        mercedes.increaseSpeed(50);
        System.out.println(mercedes.speed);
        System.out.printf(mercedes.color);
    }
}

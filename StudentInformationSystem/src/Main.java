public class Main {

    public static void main(String[] args) {


        Teacher teacher1 = new Teacher("Akin", "539627941945", "Web design");
        Teacher teacher2 = new Teacher("Aykut", "539627941945", "Office design");
        Teacher teacher3 = new Teacher("Akin Aykut", "539627941945", "Home design");


        Course course1 = new Course("Web design", "Web155", "asd", 100, teacher1);
        Course course2 = new Course("Office design", "Office155", "123", 100, teacher2);
        Course course3 = new Course("Home design", "Home155", "asd123", 100, teacher3);



        Student student1 = new Student("Ahmet", 14, course1, course2, course3);

        student1.course1Info();
        student1.course2Info();
        student1.course3Info();

    }


}

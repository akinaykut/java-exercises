public class Student {
    String name;
    int no;
    Course c1;
    Course c2;
    Course c3;


    Student(String name, int no, Course c1, Course c2, Course c3) {
        this.name = name;
        this.no = no;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

    }


    void course1Info() {
        this.c1.teacherInfo();
    }


    void course2Info() {
        this.c2.teacherInfo();
    }

    void course3Info() {
        this.c3.teacherInfo();
    }
}



public class Course {

    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;



    Course( String name, String code, String prefix, int note, Teacher teacher) {

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
        this.teacher = teacher;


    }


    void teacherInfo() {
        this.teacher.print();
    }



}

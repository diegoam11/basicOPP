import java.util.ArrayList;

public class Class {
    int grade;
    char section;
    ArrayList<Student> listStudents;

    Class(int grade, char section){
        this.grade = grade;
        this.section = section;
        listStudents = new ArrayList<>();
    }

    void addStudent(Student student){
        System.out.println(student.name + " is a new student of " + this.grade + this.section + " class" );
        listStudents.add(student);
    }

    void showStudents(){
        for (Student i : listStudents){
            System.out.println(i.name);
            System.out.println(i.code);
        }
    }
}

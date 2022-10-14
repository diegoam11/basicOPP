public class Main{
    public static void main(String[] args){
        Class firstClass = new Class(4, 'a');
        Student student1 = new Student("Diego More", 21200022);
        Student student2 = new Student("Diego Falla", 19700102);
        Student student3 = new Student("Gianfranco Alejandro", 21200021);
        Student student4 = new Student("Rodrigo Davila", 21200022);

        firstClass.addStudent(student1);
        firstClass.addStudent(student2);
        firstClass.addStudent(student3);
        firstClass.addStudent(student4);

        System.out.println(firstClass.listStudents);
        firstClass.showStudents();
    }
}
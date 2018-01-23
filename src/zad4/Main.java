package zad4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.setFirstName("Johnny");
//        student1.setLastName("Cash");
//        student1.setGender(Gender.MALE);
//        student1.setYear(12);
//        student1.setPesel("123213213");
//        student1.setStudies("blues");
//        Student student2 = new Student();
//        student2.setFirstName("Jan");
//        student2.setLastName("Kowalski");
//        student2.setGender(Gender.MALE);
//        student2.setPesel("432432");
//        student2.setStudies("informatyka");
//        Student student3 = new Student();
//        student3.setFirstName("Anna");
//        student3.setLastName("Maria");
//        student3.setGender(Gender.FEMALE);
//        student3.setPesel("4324322222");
//        student3.setStudies("muzyka");
//        student3.setYear(2);
//        List<Student> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);

        StudentOperator studentOperator = new StudentOperator("src/zad4/students.txt");
//        studentOperator.save(students);
        System.out.println(studentOperator.getStudents());
        Optional<Student> studentOptional = studentOperator.getStudent("4324322222");
        if(studentOptional.isPresent()){
            System.out.println(studentOptional.get());
        }
        else System.out.println("student doesnt exist");

        studentOperator.updateStudent("123213213","informatyka",8);

    }
}

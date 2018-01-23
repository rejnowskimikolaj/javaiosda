package zad4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentOperator {

    private String fileName;


    public StudentOperator(String fileName) {
        this.fileName = fileName;
    }

    public void save(List<Student> studentList){
        try {

            FileWriter fileWriter = new FileWriter(fileName);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(Student student:studentList){
                String line = student.toString();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

                bufferedWriter.close();
        }

        catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public List<Student> getStudents() {
        String line;
        List<Student> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                list.add(new Student(line));
            }

            bufferedReader.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
        return list;
    }

    public Optional<Student> getStudent(String pesel){

        List<Student> students = getStudents();

        for(Student student:students){
            if(student.getPesel().equals(pesel)) return Optional.of(student);
        }
         return Optional.empty();
    }

    public Optional<Student> updateStudent(String pesel, String studies, int year){

        Optional<Student> studentOptional = getStudent(pesel);
        if(!studentOptional.isPresent()) {
            System.out.println("student nie istnieje!");
            return Optional.empty();
        }

        List<Student> students = getStudents();
        for(Student student:students){
            if(student.getPesel().equals(pesel)){

                student.setStudies(studies);
                student.setYear(year);
            }
        }
        save(students);
        return studentOptional;
    }
}

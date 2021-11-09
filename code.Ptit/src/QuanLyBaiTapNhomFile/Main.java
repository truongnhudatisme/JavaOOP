package QuanLyBaiTapNhomFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Student> listStudents = new ArrayList<>();
        ArrayList<Exercise> listExercises = new ArrayList<>();
        ArrayList<Group> listGroups = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            listStudents.add(new Student(sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        sc.close();
        sc = new Scanner(new File("BAITAP.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            listExercises.add(new Exercise(sc.nextLine()));
        }
        sc.close();
        sc = new Scanner(new File("NHOM.in"));
        while(sc.hasNextLine()){
            String[] argv = sc.nextLine().split("\\s+");
            listGroups.add(new Group(findStudent(listStudents,argv[0]),findExercise(listExercises, argv[1])));
        }
        Collections.sort(listGroups);
        for (Group group : listGroups) {
            System.out.println(group);
        }
        sc.close();
    }
    private static Student findStudent(ArrayList<Student> listStudents,String student_code){
        for (Student student : listStudents) {
            if(student.getStudent_code().equals(student_code)) 
                return student;
        }
        return null;
    }
    private static Exercise findExercise(ArrayList<Exercise> listExercises, String group_id){
        for (Exercise exercise : listExercises) {
            if(exercise.getExe_code() == Integer.parseInt(group_id))
                return exercise;
        }
        return null;
    }
}

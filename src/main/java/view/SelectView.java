package view;

import dob.Student;
import dob.StudentsInfo;
import tables.ITable;
import tables.StudentTable;

import java.util.List;

public class SelectView {

    public static void printAllStudent(List<Student> students){
        for (int i = 0; i < students.size();i++) {
            System.out.println(students.get(i).getFio() +
                    "       " + students.get(i).getSex() +
                    "        " + students.get(i).getIdGroup());
        }
        System.out.println("---------------------------");
    }
    public static void printStudentInfo(List<StudentsInfo> students){
        for (int i = 0; i < students.size();i++) {
            System.out.println(students.get(i).getFio() +
                    "       " + students.get(i).getSex() +
                    "        " + students.get(i).getGroupName() +
                    "        " + students.get(i).getFioCurator());
        }
        System.out.println("---------------------------");
    }
    public static void printGroupInfo(List<StudentsInfo> students){
        for (int i = 0; i < students.size();i++) {
            System.out.println(students.get(i).getGroupName() +
                    "        " + students.get(i).getFioCurator());
        }
        System.out.println("---------------------------");
    }

}

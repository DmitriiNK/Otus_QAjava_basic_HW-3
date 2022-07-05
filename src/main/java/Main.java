import dob.Group;
import dob.Student;
import dob.StudentsInfo;
import tables.GroupTable;
import tables.ITable;
import tables.StudentInfoTable;
import tables.StudentTable;

import java.sql.*;
import java.util.List;

import static view.SelectView.*;


class Main {
    public static void main(String args[]) throws SQLException {
        String[] predicates = new String[]{};
        ITable studentTable = new StudentTable();
        List<Student> students = studentTable.list(predicates);
        ITable studentTableInfo = new StudentInfoTable();
        List<StudentsInfo> studentsInfo = studentTableInfo.list(predicates);
        List<Student> studentsWomen = ((StudentTable) studentTable).listWomen(predicates);

        // Запросы
      printAllStudent(students);// Вывести на экран информацию о всех студентах;
        ((StudentTable) studentTable).studentCount(); // Вывести на экран количество студентов;
      printStudentInfo(studentsInfo); //Вывести на экран информацию о всех студентах включая название группы и имя куратора
      // printAllStudent(studentsWomen); //Вывести студенток
      // printGroupInfo(studentsInfo); //Вывести список групп с их кураторами
    }
}  
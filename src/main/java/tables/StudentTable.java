package tables;

import db.IDBExecute;
import db.MySQLDBExecutor;
import dob.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentTable extends TableAbs {
private final String tableName  = "Students";
    @Override
    public List list(String[] predicates) throws SQLException {
       String listStudentQuery = String.format("select * from %s",tableName);
        List<Student> students =  new ArrayList<>();
        ResultSet resultSet = idbExecute.execute(listStudentQuery);

        while (resultSet.next()){
            Student sdudent = new Student(
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(4)
            );
            students.add(sdudent);
        }
        return students;
    }
    public List listWomen(String[] predicates) throws SQLException {
        String listStudentQuery = "select * from Students where Sex  = 'W'";
        List<Student> students =  new ArrayList<>();
        ResultSet resultSet = idbExecute.execute(listStudentQuery);

        while (resultSet.next()){
            Student sdudent = new Student(
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(4)
            );
            students.add(sdudent);
        }
        return students;
    }
    public void studentCount() throws SQLException {
        String listStudentQuery = String.format("select count(*) from %s", "Students");
        IDBExecute idbExecute = new MySQLDBExecutor();
        ResultSet resultSet = idbExecute.execute(listStudentQuery);
        while (resultSet.next())
            System.out.println((resultSet.getInt(1)));
    }

}

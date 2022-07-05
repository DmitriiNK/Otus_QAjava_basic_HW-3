package tables;

import db.IDBExecute;
import db.MySQLDBExecutor;
import dob.Const;
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
        String listStudentQuery = (createCountSelectStm(Const.STUDENT_TABLE));
        IDBExecute idbExecute = new MySQLDBExecutor();
        ResultSet resultSet = idbExecute.execute(listStudentQuery);
        while (resultSet.next())
            System.out.println((resultSet.getInt(1)));
    }
    private static String createSelectStm(String ... args){
        StringBuffer sql = new StringBuffer("SELECT *");
        for(int i = 0; i < args.length - 1; i++) {
            sql.append(args[i]);
            sql.append(", ");
        }
        sql.delete(sql.length() - 2, sql.length() - 1);
        sql.append(" FROM ");
        sql.append(args[args.length - 1]);
        return sql.toString();
    }
    private static String createCountSelectStm(String ... args){
        StringBuffer sql = new StringBuffer("SELECT count(*)");
        for(int i = 0; i < args.length - 1; i++) {
            sql.append(args[i]);
            sql.append(", ");
        }
        sql.delete(sql.length() - 1, sql.length() - 1);
        sql.append(" FROM ");
        sql.append(args[args.length - 1]);
        return sql.toString();
    }

}

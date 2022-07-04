package tables;

import db.IDBExecute;
import db.MySQLDBExecutor;
import dob.Student;
import dob.StudentsInfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentInfoTable extends TableAbs {
    private final String tableName1  = "Students";
    private final String tableName2  = "Grou";
    private final String tableName3  = "Сurator";
    public List list(String[] predicates) throws SQLException {
        String listStudentQuery = "select "+
                "Students.Fio,Students.Sex,Grou.Name,Сurator.Fio " +
                "from " +tableName1 +
                " INNER JOIN "+ tableName2 + " ON " +
                "Students.Id_group = Grou.ID" +
                " INNER JOIN " + tableName3 + " ON " +
                "Grou.Id_curator = Сurator.ID";
        List<StudentsInfo> studentsInfo =  new ArrayList<>();
        ResultSet resultSet = idbExecute.execute(listStudentQuery);

        while (resultSet.next()){
            StudentsInfo studentInfo = new StudentsInfo(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4)
            );
            studentsInfo.add(studentInfo);
        }
        return studentsInfo;
    }
}

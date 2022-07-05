package tables;

import db.IDBExecute;
import db.MySQLDBExecutor;
import dob.Const;
import dob.Student;
import dob.StudentsInfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentInfoTable extends TableAbs {
    public List list(String[] predicates) throws SQLException {
        String listStudentQuery =(createSelectStm(Const.STUDENT_FIO,Const.STUDENT_SEX,Const.GROUP_NAME,Const.CURATOR_FIO,Const.STUDENT_TABLE)+
                Const.INNER_JOIN + Const.GROUP_TABLE +
                " ON " + Const.FOREIGN_KEY_GROUP_STUDENT +
                Const.INNER_JOIN + Const.CURATOR_TABLE +
                " ON " + Const.FOREIGN_KEY_CURATOR_GROUP );
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
    private static String createSelectStm(String ... args){
        StringBuffer sql = new StringBuffer("SELECT ");
        for(int i = 0; i < args.length - 1; i++) {
            sql.append(args[i]);
            sql.append(", ");
        }
        sql.delete(sql.length() - 2, sql.length() - 1);
        sql.append(" FROM ");
        sql.append(args[args.length - 1]);
        return sql.toString();
    }
}

package tables;

import dob.Curator;
import dob.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GroupTable extends TableAbs {
    public List list(String[] predicates) throws SQLException {
        String curatorUpdateQuery = "update Сurator set Fio = 'Update2' where Fio = 'Update1'";
        idbExecute.execute(curatorUpdateQuery);
        List<Curator> curators =  new ArrayList<>();
        ResultSet resultSet = idbExecute.execute(curatorUpdateQuery);

        while (resultSet.next()){
            Curator curator = new Curator(
                    resultSet.getInt(1),
                    resultSet.getString(2)
            );
            curators.add(curator);
        }
        return curators;
    }


}

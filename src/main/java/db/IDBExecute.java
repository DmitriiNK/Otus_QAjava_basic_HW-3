package db;

import java.sql.ResultSet;

public interface IDBExecute {
    ResultSet execute (String query);
}

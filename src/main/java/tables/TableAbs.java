package tables;

import db.IDBExecute;
import db.MySQLDBExecutor;

import java.sql.ResultSet;

public abstract class TableAbs implements  ITable{
protected IDBExecute idbExecute = new MySQLDBExecutor();
}

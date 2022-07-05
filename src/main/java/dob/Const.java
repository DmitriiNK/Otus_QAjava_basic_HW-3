package dob;

public class Const {
    public static final String STUDENT_TABLE = "Students";
    public static final String GROUP_TABLE = "Grou";
    public static final String CURATOR_TABLE = "Сurator";

    public static final String STUDENT_FIO = "Students.Fio";
    public static final String STUDENT_SEX = "Students.Sex";
    public static final String STUDENT_ID_GROUP = "Students.Id_group";

    public static final String GROUP_NAME = "Grou.Name";
    public static final String GROUP_ID = "Grou.ID";
    public static final String GROUP_ID_CURATOR = "Grou.Id_curator";
    public static final String FOREIGN_KEY_GROUP_STUDENT = Const.STUDENT_ID_GROUP +" = "+ GROUP_ID;

    public static final String CURATOR_FIO = "Сurator.Fio";
    public static final String CURATOR_ID = "Сurator.ID";
    public static final String FOREIGN_KEY_CURATOR_GROUP = GROUP_ID_CURATOR +" = "+ CURATOR_ID;

    public static final String INNER_JOIN = " INNER JOIN ";
}

package dob;

public class Student {


    public Student(String fio, String sex, int idGroup) {
        this.fio = fio;
        this.sex = sex;
        this.idGroup = idGroup;
    }

    private String sex;

    public String getSex() {
        return sex;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public String getFio() {
        return fio;
    }

    private int idGroup;
    private String fio;
}

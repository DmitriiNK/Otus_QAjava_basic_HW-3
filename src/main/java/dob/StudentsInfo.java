package dob;

public class StudentsInfo {
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getFioCurator() {
        return fioCurator;
    }

    public void setFioCurator(String fioCurator) {
        this.fioCurator = fioCurator;
    }

    private String fio;
    private String sex;

    public StudentsInfo(String fio, String sex, String groupName, String fioCurator) {
        this.fio = fio;
        this.sex = sex;
        this.groupName = groupName;
        this.fioCurator = fioCurator;
    }

    private String groupName;
    private String fioCurator;
}

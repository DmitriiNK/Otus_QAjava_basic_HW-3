package dob;

public class Group {


    public String getGroupName() {
        return groupName;
    }

    public int getIdCurator() {
        return idCurator;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setIdCurator(int idCurator) {
        this.idCurator = idCurator;
    }

    public Group(String groupName, int idCurator) {
        this.groupName = groupName;
        this.idCurator = idCurator;
    }

    private String groupName;
    private int idCurator;

}


package dob;

public class Curator {
    public int getIdCurator() {
        return idCurator;
    }

    public void setIdCurator(int idCurator) {
        this.idCurator = idCurator;
    }

    public String getFio() {
        return fioCurator;
    }

    public void setFio(String fio) {
        this.fioCurator = fio;
    }

    public Curator(int idCurator, String fio) {
        this.idCurator = idCurator;
        this.fioCurator = fio;
    }

    private int idCurator;
    private String fioCurator;
}

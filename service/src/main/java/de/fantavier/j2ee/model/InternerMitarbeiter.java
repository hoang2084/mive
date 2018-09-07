package de.fantavier.j2ee.model;

public class InternerMitarbeiter extends Employee {

    private int id;
    private Job job;
    private Abteilung abteilung;

    public InternerMitarbeiter(int id, Job job, Abteilung abteilung) {
        this.id = id;
        this.job = job;
        this.abteilung = abteilung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Abteilung getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(Abteilung abteilung) {
        this.abteilung = abteilung;
    }
}

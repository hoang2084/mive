package de.fantavier.j2ee.model;

public class ExternerMitarbeiter extends Employee{

    private Job job;
    private int id;

    public ExternerMitarbeiter(Job job, int id) {
        this.job = job;
        this.id = id;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package de.fantavier.j2ee.model;

public class Job {

    private String jobname;
    private int niveau;

    public Job(String jobname, int niveau) {
        this.jobname = jobname;
        this.niveau = niveau;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
}

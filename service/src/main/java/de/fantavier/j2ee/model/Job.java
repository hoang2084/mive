package de.fantavier.j2ee.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table (name = "JOB")
@Data
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name="JOBNAME")
    @Basic(optional = false)
    private String jobname;

    @Column(name="NIVEAU")
    @Basic(optional = false)
    private int niveau;

    public Job(String jobname, int niveau) {
        this.jobname = jobname;
        this.niveau = niveau;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

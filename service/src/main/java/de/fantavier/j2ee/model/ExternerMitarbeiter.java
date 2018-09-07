package de.fantavier.j2ee.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("EXTERN")
public class ExternerMitarbeiter extends Employee{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name="JOB")
    @Basic(optional = false)
    private Job job;

    @Column(name="KENNUNG")
    @Basic(optional = false)
    private int kennung;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ExternerMitarbeiter(Job job, int kennung) {
        this.job = job;
        this.kennung = kennung;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getKennung() {
        return kennung;
    }

    public void setKennung(int kennung) {
        this.kennung = kennung;
    }
}

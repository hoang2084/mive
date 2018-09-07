package de.fantavier.j2ee.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@DiscriminatorValue("INTERN")
public class InternerMitarbeiter extends Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name="KENNUNG")
    @Basic(optional = false)
    private int kennung;

    @Column(name="JOB")
    @Basic(optional = false)
    private Job job;

    @Column(name="ABTEILUNG")
    @Basic(optional = false)
    private Abteilung abteilung;

    public InternerMitarbeiter(){}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public InternerMitarbeiter(int kennung, Job job, Abteilung abteilung) {
        this.kennung = kennung;
        this.job = job;
        this.abteilung = abteilung;
    }

    public int getKennung() {
        return kennung;
    }

    public void setKennung(int kennung) {
        this.kennung = kennung;
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

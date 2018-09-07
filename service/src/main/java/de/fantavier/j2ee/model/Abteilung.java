package de.fantavier.j2ee.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ABTEILUNG")
@Data
public class Abteilung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name="ABTEILUNG")
    @Basic(optional = false)
    private String abteilungsname;

    @Column(name="STANDORT")
    @Basic(optional = false)
    private String standort;


    public Abteilung(String abteilungsname, String standort) {
        this.abteilungsname = abteilungsname;
        this.standort = standort;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAbteilungsname() {
        return abteilungsname;
    }

    public void setAbteilungsname(String abteilungsname) {
        this.abteilungsname = abteilungsname;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }
}

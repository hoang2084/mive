package de.fantavier.j2ee.model;

public class Abteilung {

    private String abteilungsname;
    private String standort;

    public Abteilung(String abteilungsname, String standort) {
        this.abteilungsname = abteilungsname;
        this.standort = standort;
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

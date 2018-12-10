package com.github.marcosrafaellsousa.loinc.negocio;

public class Loinc {
    private String loinc_num;
    private String component;
    private String shortname;
    private String system;

    public String getLoinc_num() {
        return loinc_num;
    }

    public void setLoinc_num(String loinc_num) {
        this.loinc_num = loinc_num;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }
}

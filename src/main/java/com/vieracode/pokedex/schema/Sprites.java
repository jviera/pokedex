
package com.vieracode.pokedex.schema;

import java.util.HashMap;
import java.util.Map;

public class Sprites {

    private String backDefault;
    private Object backFemale;
    private String backShiny;
    private Object backShinyFemale;
    private String frontDefault;
    private Object frontFemale;
    private String frontShiny;
    private Object frontShinyFemale;
    private Other other;
    private Versions versions;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getBackDefault() {
        return backDefault;
    }

    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    public Object getBackFemale() {
        return backFemale;
    }

    public void setBackFemale(Object backFemale) {
        this.backFemale = backFemale;
    }

    public String getBackShiny() {
        return backShiny;
    }

    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    public Object getBackShinyFemale() {
        return backShinyFemale;
    }

    public void setBackShinyFemale(Object backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public Object getFrontFemale() {
        return frontFemale;
    }

    public void setFrontFemale(Object frontFemale) {
        this.frontFemale = frontFemale;
    }

    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    public Object getFrontShinyFemale() {
        return frontShinyFemale;
    }

    public void setFrontShinyFemale(Object frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    public Versions getVersions() {
        return versions;
    }

    public void setVersions(Versions versions) {
        this.versions = versions;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

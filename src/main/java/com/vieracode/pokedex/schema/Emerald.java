
package com.vieracode.pokedex.schema;

import java.util.HashMap;
import java.util.Map;

public class Emerald {

    private String frontDefault;
    private String frontShiny;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

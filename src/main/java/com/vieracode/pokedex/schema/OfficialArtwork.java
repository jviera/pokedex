
package com.vieracode.pokedex.schema;

import java.util.HashMap;
import java.util.Map;

public class OfficialArtwork {

    private String frontDefault;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

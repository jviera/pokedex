
package com.vieracode.pokedex.schema;

import java.util.HashMap;
import java.util.Map;

public class VersionDetail {

    private Integer rarity;
    private Version_ version;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public Version_ getVersion() {
        return version;
    }

    public void setVersion(Version_ version) {
        this.version = version;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

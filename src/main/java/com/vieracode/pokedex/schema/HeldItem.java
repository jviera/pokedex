
package com.vieracode.pokedex.schema;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HeldItem {

    private Item item;
    private List<VersionDetail> versionDetails = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<VersionDetail> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<VersionDetail> versionDetails) {
        this.versionDetails = versionDetails;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.02.27 a las 02:41:19 PM CST 
//


package com.vieracode.pokedex.xml.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abilities" type="{http://www.pokedex.vieracode.com/xml/school}listType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "abilities"
})
@XmlRootElement(name = "AbilitiesResponse")
public class AbilitiesResponse {

    @XmlElement(required = true)
    protected ListType abilities;

    /**
     * Obtiene el valor de la propiedad abilities.
     * 
     * @return
     *     possible object is
     *     {@link ListType }
     *     
     */
    public ListType getAbilities() {
        return abilities;
    }

    /**
     * Define el valor de la propiedad abilities.
     * 
     * @param value
     *     allowed object is
     *     {@link ListType }
     *     
     */
    public void setAbilities(ListType value) {
        this.abilities = value;
    }

}

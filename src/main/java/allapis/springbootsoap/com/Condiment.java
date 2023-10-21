//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.10.19 à 08:00:53 PM CEST 
//


package allapis.springbootsoap.com;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour condiment complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="condiment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="condimentId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nomCondiment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="qauntite" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "condiment", propOrder = {
    "condimentId",
    "nomCondiment",
    "qauntite"
})
public class Condiment {

    protected int condimentId;
    @XmlElement(required = true)
    protected String nomCondiment;
    protected int qauntite;

    /**
     * Obtient la valeur de la propriété condimentId.
     * 
     */
    public int getCondimentId() {
        return condimentId;
    }

    /**
     * Définit la valeur de la propriété condimentId.
     * 
     */
    public void setCondimentId(int value) {
        this.condimentId = value;
    }

    /**
     * Obtient la valeur de la propriété nomCondiment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCondiment() {
        return nomCondiment;
    }

    /**
     * Définit la valeur de la propriété nomCondiment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCondiment(String value) {
        this.nomCondiment = value;
    }

    /**
     * Obtient la valeur de la propriété qauntite.
     * 
     */
    public int getQauntite() {
        return qauntite;
    }

    /**
     * Définit la valeur de la propriété qauntite.
     * 
     */
    public void setQauntite(int value) {
        this.qauntite = value;
    }

}

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
 * <p>Classe Java pour getCondimentByNomResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCondimentByNomResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="condiment" type="{http://com.springbootsoap.allapis}condiment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCondimentByNomResponse", propOrder = {
    "condiment"
})
public class GetCondimentByNomResponse {

    @XmlElement(required = true)
    protected Condiment condiment;

    /**
     * Obtient la valeur de la propriété condiment.
     * 
     * @return
     *     possible object is
     *     {@link Condiment }
     *     
     */
    public Condiment getCondiment() {
        return condiment;
    }

    /**
     * Définit la valeur de la propriété condiment.
     * 
     * @param value
     *     allowed object is
     *     {@link Condiment }
     *     
     */
    public void setCondiment(Condiment value) {
        this.condiment = value;
    }

}

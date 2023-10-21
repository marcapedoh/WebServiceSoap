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
 * <p>Classe Java pour getPlatByIdResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getPlatByIdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plat" type="{http://com.springbootsoap.allapis}plat"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPlatByIdResponse", propOrder = {
    "plat"
})
public class GetPlatByIdResponse {

    @XmlElement(required = true)
    protected Plat plat;

    /**
     * Obtient la valeur de la propriété plat.
     * 
     * @return
     *     possible object is
     *     {@link Plat }
     *     
     */
    public Plat getPlat() {
        return plat;
    }

    /**
     * Définit la valeur de la propriété plat.
     * 
     * @param value
     *     allowed object is
     *     {@link Plat }
     *     
     */
    public void setPlat(Plat value) {
        this.plat = value;
    }

}

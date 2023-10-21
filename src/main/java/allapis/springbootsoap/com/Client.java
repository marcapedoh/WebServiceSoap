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
 * <p>Classe Java pour client complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="client"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nomClient" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prenomClient" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroTel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "client", propOrder = {
    "clientId",
    "nomClient",
    "prenomClient",
    "numeroTel",
    "plat"
})
public class Client {

    protected int clientId;
    @XmlElement(required = true)
    protected String nomClient;
    @XmlElement(required = true)
    protected String prenomClient;
    @XmlElement(required = true)
    protected String numeroTel;
    @XmlElement(required = true)
    protected Plat plat;

    /**
     * Obtient la valeur de la propriété clientId.
     * 
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Définit la valeur de la propriété clientId.
     * 
     */
    public void setClientId(int value) {
        this.clientId = value;
    }

    /**
     * Obtient la valeur de la propriété nomClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomClient() {
        return nomClient;
    }

    /**
     * Définit la valeur de la propriété nomClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomClient(String value) {
        this.nomClient = value;
    }

    /**
     * Obtient la valeur de la propriété prenomClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenomClient() {
        return prenomClient;
    }

    /**
     * Définit la valeur de la propriété prenomClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenomClient(String value) {
        this.prenomClient = value;
    }

    /**
     * Obtient la valeur de la propriété numeroTel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTel() {
        return numeroTel;
    }

    /**
     * Définit la valeur de la propriété numeroTel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTel(String value) {
        this.numeroTel = value;
    }

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

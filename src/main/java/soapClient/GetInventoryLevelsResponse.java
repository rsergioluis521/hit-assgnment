
package soapClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}Inventory" minOccurs="0"/>
 *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}ServiceMessageArray" minOccurs="0"/>
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
    "inventory",
    "serviceMessageArray"
})
@XmlRootElement(name = "GetInventoryLevelsResponse", namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/")
public class GetInventoryLevelsResponse {

    @XmlElement(name = "Inventory")
    protected Inventory inventory;
    @XmlElement(name = "ServiceMessageArray")
    protected ServiceMessageArray serviceMessageArray;

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link Inventory }
     *     
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inventory }
     *     
     */
    public void setInventory(Inventory value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the serviceMessageArray property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceMessageArray }
     *     
     */
    public ServiceMessageArray getServiceMessageArray() {
        return serviceMessageArray;
    }

    /**
     * Sets the value of the serviceMessageArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceMessageArray }
     *     
     */
    public void setServiceMessageArray(ServiceMessageArray value) {
        this.serviceMessageArray = value;
    }

}

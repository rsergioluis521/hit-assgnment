
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
 *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}productId"/>
 *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}PartInventoryArray" minOccurs="0"/>
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
    "productId",
    "partInventoryArray"
})
@XmlRootElement(name = "Inventory")
public class Inventory {

    @XmlElement(required = true)
    protected String productId;
    @XmlElement(name = "PartInventoryArray")
    protected PartInventoryArray partInventoryArray;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the partInventoryArray property.
     * 
     * @return
     *     possible object is
     *     {@link PartInventoryArray }
     *     
     */
    public PartInventoryArray getPartInventoryArray() {
        return partInventoryArray;
    }

    /**
     * Sets the value of the partInventoryArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartInventoryArray }
     *     
     */
    public void setPartInventoryArray(PartInventoryArray value) {
        this.partInventoryArray = value;
    }

}

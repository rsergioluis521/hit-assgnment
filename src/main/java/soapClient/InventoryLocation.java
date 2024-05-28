
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
 *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}inventoryLocationId"/>
 *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}inventoryLocationName" minOccurs="0"/>
 *         &lt;element name="postalCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="country" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.codesynthesis.com/xmlns/xsstl}ISO3166CountyCode">
 *               &lt;maxLength value="2"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}inventoryLocationQuantity"/>
 *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}FutureAvailabilityArray" minOccurs="0"/>
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
    "inventoryLocationId",
    "inventoryLocationName",
    "postalCode",
    "country",
    "inventoryLocationQuantity",
    "futureAvailabilityArray"
})
@XmlRootElement(name = "InventoryLocation")
public class InventoryLocation {

    @XmlElement(required = true)
    protected String inventoryLocationId;
    protected String inventoryLocationName;
    protected String postalCode;
    protected ISO3166CountyCode country;
    @XmlElement(required = true)
    protected InventoryLocationQuantity inventoryLocationQuantity;
    @XmlElement(name = "FutureAvailabilityArray")
    protected FutureAvailabilityArray futureAvailabilityArray;

    /**
     * The inventory location ID
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryLocationId() {
        return inventoryLocationId;
    }

    /**
     * Sets the value of the inventoryLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryLocationId(String value) {
        this.inventoryLocationId = value;
    }

    /**
     * Inventory location name
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryLocationName() {
        return inventoryLocationName;
    }

    /**
     * Sets the value of the inventoryLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryLocationName(String value) {
        this.inventoryLocationName = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link ISO3166CountyCode }
     *     
     */
    public ISO3166CountyCode getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISO3166CountyCode }
     *     
     */
    public void setCountry(ISO3166CountyCode value) {
        this.country = value;
    }

    /**
     * The quantity available in a workcenter
     * 
     * @return
     *     possible object is
     *     {@link InventoryLocationQuantity }
     *     
     */
    public InventoryLocationQuantity getInventoryLocationQuantity() {
        return inventoryLocationQuantity;
    }

    /**
     * Sets the value of the inventoryLocationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLocationQuantity }
     *     
     */
    public void setInventoryLocationQuantity(InventoryLocationQuantity value) {
        this.inventoryLocationQuantity = value;
    }

    /**
     * An array of future incoming stock
     * 
     * @return
     *     possible object is
     *     {@link FutureAvailabilityArray }
     *     
     */
    public FutureAvailabilityArray getFutureAvailabilityArray() {
        return futureAvailabilityArray;
    }

    /**
     * Sets the value of the futureAvailabilityArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureAvailabilityArray }
     *     
     */
    public void setFutureAvailabilityArray(FutureAvailabilityArray value) {
        this.futureAvailabilityArray = value;
    }

}

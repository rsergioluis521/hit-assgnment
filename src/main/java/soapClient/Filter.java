
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
 *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}partIdArray" minOccurs="0"/>
 *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}LabelSizeArray" minOccurs="0"/>
 *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}PartColorArray" minOccurs="0"/>
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
    "partIdArray",
    "labelSizeArray",
    "partColorArray"
})
@XmlRootElement(name = "Filter")
public class Filter {

    protected PartIdArray partIdArray;
    @XmlElement(name = "LabelSizeArray")
    protected LabelSizeArray labelSizeArray;
    @XmlElement(name = "PartColorArray")
    protected PartColorArray partColorArray;

    /**
     * Gets the value of the partIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link PartIdArray }
     *     
     */
    public PartIdArray getPartIdArray() {
        return partIdArray;
    }

    /**
     * Sets the value of the partIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartIdArray }
     *     
     */
    public void setPartIdArray(PartIdArray value) {
        this.partIdArray = value;
    }

    /**
     * Gets the value of the labelSizeArray property.
     * 
     * @return
     *     possible object is
     *     {@link LabelSizeArray }
     *     
     */
    public LabelSizeArray getLabelSizeArray() {
        return labelSizeArray;
    }

    /**
     * Sets the value of the labelSizeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelSizeArray }
     *     
     */
    public void setLabelSizeArray(LabelSizeArray value) {
        this.labelSizeArray = value;
    }

    /**
     * Gets the value of the partColorArray property.
     * 
     * @return
     *     possible object is
     *     {@link PartColorArray }
     *     
     */
    public PartColorArray getPartColorArray() {
        return partColorArray;
    }

    /**
     * Sets the value of the partColorArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartColorArray }
     *     
     */
    public void setPartColorArray(PartColorArray value) {
        this.partColorArray = value;
    }

}

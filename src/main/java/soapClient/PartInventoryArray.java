
package soapClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="PartInventory" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}partId"/>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}mainPart"/>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}partColor" minOccurs="0"/>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}labelSize" minOccurs="0"/>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}partDescription" minOccurs="0"/>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}quantityAvailable" minOccurs="0"/>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}manufacturedItem"/>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}buyToOrder"/>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}replenishmentLeadTime" minOccurs="0"/>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}attributeSelection" minOccurs="0"/>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}InventoryLocationArray" minOccurs="0"/>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}lastModified" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "partInventory"
})
@XmlRootElement(name = "PartInventoryArray")
public class PartInventoryArray {

    @XmlElement(name = "PartInventory", required = true)
    protected List<PartInventoryArray.PartInventory> partInventory;

    /**
     * Gets the value of the partInventory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partInventory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartInventory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartInventoryArray.PartInventory }
     * 
     * 
     */
    public List<PartInventoryArray.PartInventory> getPartInventory() {
        if (partInventory == null) {
            partInventory = new ArrayList<PartInventoryArray.PartInventory>();
        }
        return this.partInventory;
    }


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
     *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}partId"/>
     *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}mainPart"/>
     *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}partColor" minOccurs="0"/>
     *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}labelSize" minOccurs="0"/>
     *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}partDescription" minOccurs="0"/>
     *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}quantityAvailable" minOccurs="0"/>
     *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}manufacturedItem"/>
     *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}buyToOrder"/>
     *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}replenishmentLeadTime" minOccurs="0"/>
     *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}attributeSelection" minOccurs="0"/>
     *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}InventoryLocationArray" minOccurs="0"/>
     *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}lastModified" minOccurs="0"/>
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
        "partId",
        "mainPart",
        "partColor",
        "labelSize",
        "partDescription",
        "quantityAvailable",
        "manufacturedItem",
        "buyToOrder",
        "replenishmentLeadTime",
        "attributeSelection",
        "inventoryLocationArray",
        "lastModified"
    })
    public static class PartInventory {

        @XmlElement(required = true)
        protected String partId;
        protected boolean mainPart;
        protected String partColor;
        protected String labelSize;
        protected String partDescription;
        protected QuantityAvailable quantityAvailable;
        protected boolean manufacturedItem;
        protected boolean buyToOrder;
        protected Integer replenishmentLeadTime;
        protected String attributeSelection;
        @XmlElement(name = "InventoryLocationArray")
        protected InventoryLocationArray inventoryLocationArray;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastModified;

        /**
         * Gets the value of the partId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartId() {
            return partId;
        }

        /**
         * Sets the value of the partId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartId(String value) {
            this.partId = value;
        }

        /**
         * 
         *                                         A boolean value indicating if this is a main part of the product. In a tumbler
         *                                         with an optional lid configuration, the parts associated with the tumbler would
         *                                         be set to TRUE. The parts associated with the Lid would be set to false.
         *                                     
         * 
         */
        public boolean isMainPart() {
            return mainPart;
        }

        /**
         * Sets the value of the mainPart property.
         * 
         */
        public void setMainPart(boolean value) {
            this.mainPart = value;
        }

        /**
         * 
         *                                         Description of the color of the part
         *                                     
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartColor() {
            return partColor;
        }

        /**
         * Sets the value of the partColor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartColor(String value) {
            this.partColor = value;
        }

        /**
         * 
         *                                         The apparel items tagged size. e.g. XSmall, Small, etc.
         *                                     
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabelSize() {
            return labelSize;
        }

        /**
         * Sets the value of the labelSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabelSize(String value) {
            this.labelSize = value;
        }

        /**
         * Description of the part
         *                                     
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartDescription() {
            return partDescription;
        }

        /**
         * Sets the value of the partDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartDescription(String value) {
            this.partDescription = value;
        }

        /**
         * An integer which shows the sum of inventory of all warehouses of
         *                                         the part
         *                                     
         * 
         * @return
         *     possible object is
         *     {@link QuantityAvailable }
         *     
         */
        public QuantityAvailable getQuantityAvailable() {
            return quantityAvailable;
        }

        /**
         * Sets the value of the quantityAvailable property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuantityAvailable }
         *     
         */
        public void setQuantityAvailable(QuantityAvailable value) {
            this.quantityAvailable = value;
        }

        /**
         * Indicates that the supplier produces this part according to
         *                                         demand. The supplier may keep a limited amount of inventory or inventory may be
         *                                         0.
         *                                     
         * 
         */
        public boolean isManufacturedItem() {
            return manufacturedItem;
        }

        /**
         * Sets the value of the manufacturedItem property.
         * 
         */
        public void setManufacturedItem(boolean value) {
            this.manufacturedItem = value;
        }

        /**
         * Indicates that the supplier purchases this product to order.
         *                                         The supplier may keep a limited amount of inventory, show available inventory to buy,
         *                                         or it might be 0.
         *                                     
         * 
         */
        public boolean isBuyToOrder() {
            return buyToOrder;
        }

        /**
         * Sets the value of the buyToOrder property.
         * 
         */
        public void setBuyToOrder(boolean value) {
            this.buyToOrder = value;
        }

        /**
         * Gets the value of the replenishmentLeadTime property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getReplenishmentLeadTime() {
            return replenishmentLeadTime;
        }

        /**
         * Sets the value of the replenishmentLeadTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setReplenishmentLeadTime(Integer value) {
            this.replenishmentLeadTime = value;
        }

        /**
         * A string describing the attribute of the product other than size
         *                                         and color
         *                                     
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeSelection() {
            return attributeSelection;
        }

        /**
         * Sets the value of the attributeSelection property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeSelection(String value) {
            this.attributeSelection = value;
        }

        /**
         * An array of InventoryLocation objects
         *                                     
         * 
         * @return
         *     possible object is
         *     {@link InventoryLocationArray }
         *     
         */
        public InventoryLocationArray getInventoryLocationArray() {
            return inventoryLocationArray;
        }

        /**
         * Sets the value of the inventoryLocationArray property.
         * 
         * @param value
         *     allowed object is
         *     {@link InventoryLocationArray }
         *     
         */
        public void setInventoryLocationArray(InventoryLocationArray value) {
            this.inventoryLocationArray = value;
        }

        /**
         * 
         *                                         A date timestamp in UTC specifying the last time inventory was modified.
         *                                     
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastModified(XMLGregorianCalendar value) {
            this.lastModified = value;
        }

    }

}


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
 *         &lt;element name="FilterValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}productId"/>
 *                   &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}Filter"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "filterValues",
    "serviceMessageArray"
})
@XmlRootElement(name = "GetFilterValuesResponse", namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/")
public class GetFilterValuesResponse {

    @XmlElement(name = "FilterValues", namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/")
    protected GetFilterValuesResponse.FilterValues filterValues;
    @XmlElement(name = "ServiceMessageArray")
    protected ServiceMessageArray serviceMessageArray;

    /**
     * Gets the value of the filterValues property.
     * 
     * @return
     *     possible object is
     *     {@link GetFilterValuesResponse.FilterValues }
     *     
     */
    public GetFilterValuesResponse.FilterValues getFilterValues() {
        return filterValues;
    }

    /**
     * Sets the value of the filterValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFilterValuesResponse.FilterValues }
     *     
     */
    public void setFilterValues(GetFilterValuesResponse.FilterValues value) {
        this.filterValues = value;
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
     *         &lt;element ref="{http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/}Filter"/>
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
        "filter"
    })
    public static class FilterValues {

        @XmlElement(required = true)
        protected String productId;
        @XmlElement(name = "Filter", required = true)
        protected Filter filter;

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
         * Gets the value of the filter property.
         * 
         * @return
         *     possible object is
         *     {@link Filter }
         *     
         */
        public Filter getFilter() {
            return filter;
        }

        /**
         * Sets the value of the filter property.
         * 
         * @param value
         *     allowed object is
         *     {@link Filter }
         *     
         */
        public void setFilter(Filter value) {
            this.filter = value;
        }

    }

}

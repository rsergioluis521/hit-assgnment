
package soapClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soapClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReplenishmentLeadTime_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "replenishmentLeadTime");
    private final static QName _InventoryLocationName_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "inventoryLocationName");
    private final static QName _PartColor_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "partColor");
    private final static QName _AvailableOn_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "availableOn");
    private final static QName _InventoryLocationId_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "inventoryLocationId");
    private final static QName _ProductId_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "productId");
    private final static QName _PartId_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "partId");
    private final static QName _ManufacturedItem_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "manufacturedItem");
    private final static QName _Id_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "id");
    private final static QName _BuyToOrder_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "buyToOrder");
    private final static QName _LastModified_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "lastModified");
    private final static QName _WsVersion_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "wsVersion");
    private final static QName _Password_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "password");
    private final static QName _LabelSize_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "labelSize");
    private final static QName _AttributeSelection_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "attributeSelection");
    private final static QName _MainPart_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "mainPart");
    private final static QName _PartDescription_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "partDescription");
    private final static QName _Selection_QNAME = new QName("http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", "selection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFilterValuesResponse }
     * 
     */
    public GetFilterValuesResponse createGetFilterValuesResponse() {
        return new GetFilterValuesResponse();
    }

    /**
     * Create an instance of {@link PartInventoryArray }
     * 
     */
    public PartInventoryArray createPartInventoryArray() {
        return new PartInventoryArray();
    }

    /**
     * Create an instance of {@link GetFilterValuesResponse.FilterValues }
     * 
     */
    public GetFilterValuesResponse.FilterValues createGetFilterValuesResponseFilterValues() {
        return new GetFilterValuesResponse.FilterValues();
    }

    /**
     * Create an instance of {@link ServiceMessageArray }
     * 
     */
    public ServiceMessageArray createServiceMessageArray() {
        return new ServiceMessageArray();
    }

    /**
     * Create an instance of {@link ServiceMessage }
     * 
     */
    public ServiceMessage createServiceMessage() {
        return new ServiceMessage();
    }

    /**
     * Create an instance of {@link GetInventoryLevelsResponse }
     * 
     */
    public GetInventoryLevelsResponse createGetInventoryLevelsResponse() {
        return new GetInventoryLevelsResponse();
    }

    /**
     * Create an instance of {@link Inventory }
     * 
     */
    public Inventory createInventory() {
        return new Inventory();
    }

    /**
     * Create an instance of {@link PartInventoryArray.PartInventory }
     * 
     */
    public PartInventoryArray.PartInventory createPartInventoryArrayPartInventory() {
        return new PartInventoryArray.PartInventory();
    }

    /**
     * Create an instance of {@link GetFilterValuesRequest }
     * 
     */
    public GetFilterValuesRequest createGetFilterValuesRequest() {
        return new GetFilterValuesRequest();
    }

    /**
     * Create an instance of {@link GetInventoryLevelsRequest }
     * 
     */
    public GetInventoryLevelsRequest createGetInventoryLevelsRequest() {
        return new GetInventoryLevelsRequest();
    }

    /**
     * Create an instance of {@link Filter }
     * 
     */
    public Filter createFilter() {
        return new Filter();
    }

    /**
     * Create an instance of {@link PartIdArray }
     * 
     */
    public PartIdArray createPartIdArray() {
        return new PartIdArray();
    }

    /**
     * Create an instance of {@link LabelSizeArray }
     * 
     */
    public LabelSizeArray createLabelSizeArray() {
        return new LabelSizeArray();
    }

    /**
     * Create an instance of {@link PartColorArray }
     * 
     */
    public PartColorArray createPartColorArray() {
        return new PartColorArray();
    }

    /**
     * Create an instance of {@link QuantityAvailable }
     * 
     */
    public QuantityAvailable createQuantityAvailable() {
        return new QuantityAvailable();
    }

    /**
     * Create an instance of {@link Quantity }
     * 
     */
    public Quantity createQuantity() {
        return new Quantity();
    }

    /**
     * Create an instance of {@link InventoryLocationQuantity }
     * 
     */
    public InventoryLocationQuantity createInventoryLocationQuantity() {
        return new InventoryLocationQuantity();
    }

    /**
     * Create an instance of {@link FutureAvailability }
     * 
     */
    public FutureAvailability createFutureAvailability() {
        return new FutureAvailability();
    }

    /**
     * Create an instance of {@link FutureAvailabilityArray }
     * 
     */
    public FutureAvailabilityArray createFutureAvailabilityArray() {
        return new FutureAvailabilityArray();
    }

    /**
     * Create an instance of {@link InventoryLocationArray }
     * 
     */
    public InventoryLocationArray createInventoryLocationArray() {
        return new InventoryLocationArray();
    }

    /**
     * Create an instance of {@link InventoryLocation }
     * 
     */
    public InventoryLocation createInventoryLocation() {
        return new InventoryLocation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "replenishmentLeadTime")
    public JAXBElement<Integer> createReplenishmentLeadTime(Integer value) {
        return new JAXBElement<Integer>(_ReplenishmentLeadTime_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "inventoryLocationName")
    public JAXBElement<String> createInventoryLocationName(String value) {
        return new JAXBElement<String>(_InventoryLocationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "partColor")
    public JAXBElement<String> createPartColor(String value) {
        return new JAXBElement<String>(_PartColor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "availableOn")
    public JAXBElement<XMLGregorianCalendar> createAvailableOn(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AvailableOn_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "inventoryLocationId")
    public JAXBElement<String> createInventoryLocationId(String value) {
        return new JAXBElement<String>(_InventoryLocationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "productId")
    public JAXBElement<String> createProductId(String value) {
        return new JAXBElement<String>(_ProductId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "partId")
    public JAXBElement<String> createPartId(String value) {
        return new JAXBElement<String>(_PartId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "manufacturedItem")
    public JAXBElement<Boolean> createManufacturedItem(Boolean value) {
        return new JAXBElement<Boolean>(_ManufacturedItem_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "buyToOrder")
    public JAXBElement<Boolean> createBuyToOrder(Boolean value) {
        return new JAXBElement<Boolean>(_BuyToOrder_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "lastModified")
    public JAXBElement<XMLGregorianCalendar> createLastModified(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastModified_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "wsVersion")
    public JAXBElement<String> createWsVersion(String value) {
        return new JAXBElement<String>(_WsVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "labelSize")
    public JAXBElement<String> createLabelSize(String value) {
        return new JAXBElement<String>(_LabelSize_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "attributeSelection")
    public JAXBElement<String> createAttributeSelection(String value) {
        return new JAXBElement<String>(_AttributeSelection_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "mainPart")
    public JAXBElement<Boolean> createMainPart(Boolean value) {
        return new JAXBElement<Boolean>(_MainPart_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "partDescription")
    public JAXBElement<String> createPartDescription(String value) {
        return new JAXBElement<String>(_PartDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.promostandards.org/WSDL/Inventory/2.0.0/SharedObjects/", name = "selection")
    public JAXBElement<String> createSelection(String value) {
        return new JAXBElement<String>(_Selection_QNAME, String.class, null, value);
    }

}

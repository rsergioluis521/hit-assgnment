
package soapClient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityUomType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuantityUomType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BX"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="DZ"/>
 *     &lt;enumeration value="EA"/>
 *     &lt;enumeration value="KT"/>
 *     &lt;enumeration value="PK"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="RL"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="TH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuantityUomType")
@XmlEnum
public enum QuantityUomType {

    BX,
    CA,
    DZ,
    EA,
    KT,
    PK,
    PR,
    RL,
    SL,
    ST,
    TH;

    public String value() {
        return name();
    }

    public static QuantityUomType fromValue(String v) {
        return valueOf(v);
    }

}

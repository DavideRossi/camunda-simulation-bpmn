//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.10 at 02:35:07 PM CET 
//


package bpsim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bpsim.org/schemas/2.0}DistributionParameter">
 *       &lt;attribute name="mean" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="k" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ErlangDistribution
    extends DistributionParameter
{

    @XmlAttribute(name = "mean")
    protected Double mean;
    @XmlAttribute(name = "k")
    protected Double k;

    /**
     * Gets the value of the mean property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMean() {
        return mean;
    }

    /**
     * Sets the value of the mean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMean(Double value) {
        this.mean = value;
    }

    /**
     * Gets the value of the k property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setK(Double value) {
        this.k = value;
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.10 at 02:35:07 PM CET 
//


package bpsim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstantParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstantParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bpsim.org/schemas/2.0}ParameterValue">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstantParameter")
@XmlSeeAlso({
    StringParameter.class,
    FloatingParameter.class,
    NumericParameter.class,
    BooleanParameter.class,
    DateTimeParameter.class,
    DurationParameter.class
})
public class ConstantParameter
    extends ParameterValue
{


}

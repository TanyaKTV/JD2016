//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.29 at 11:13:05 AM MSK 
//


package by.it.sinkevich.jd02_09.TaskC;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Bet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Race" type="{http://jd02_09.sinkevich.it.by}Race"/>
 *         &lt;element name="Horse" type="{http://jd02_09.sinkevich.it.by}Horse"/>
 *         &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Payout" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *       &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bet", propOrder = {
    "race",
    "horse",
    "sum",
    "payout"
})
public class Bet {

    @XmlElement(name = "Race", required = true)
    protected Race race;
    @XmlElement(name = "Horse", required = true)
    protected Horse horse;
    @XmlElement(name = "Sum")
    protected double sum;
    @XmlElement(name = "Payout")
    protected double payout;
    @XmlAttribute(name = "time", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link Race }
     *     
     */
    public Race getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link Race }
     *     
     */
    public void setRace(Race value) {
        this.race = value;
    }

    /**
     * Gets the value of the horse property.
     * 
     * @return
     *     possible object is
     *     {@link Horse }
     *     
     */
    public Horse getHorse() {
        return horse;
    }

    /**
     * Sets the value of the horse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Horse }
     *     
     */
    public void setHorse(Horse value) {
        this.horse = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     */
    public double getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     */
    public void setSum(double value) {
        this.sum = value;
    }

    /**
     * Gets the value of the payout property.
     * 
     */
    public double getPayout() {
        return payout;
    }

    /**
     * Sets the value of the payout property.
     * 
     */
    public void setPayout(double value) {
        this.payout = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

}
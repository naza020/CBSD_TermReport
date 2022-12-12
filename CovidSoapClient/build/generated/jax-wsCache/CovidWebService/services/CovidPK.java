
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for covidPK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="covidPK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weeknum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="years" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "covidPK", propOrder = {
    "weeknum",
    "years"
})
public class CovidPK {

    protected int weeknum;
    protected int years;

    /**
     * Gets the value of the weeknum property.
     * 
     */
    public int getWeeknum() {
        return weeknum;
    }

    /**
     * Sets the value of the weeknum property.
     * 
     */
    public void setWeeknum(int value) {
        this.weeknum = value;
    }

    /**
     * Gets the value of the years property.
     * 
     */
    public int getYears() {
        return years;
    }

    /**
     * Sets the value of the years property.
     * 
     */
    public void setYears(int value) {
        this.years = value;
    }

}

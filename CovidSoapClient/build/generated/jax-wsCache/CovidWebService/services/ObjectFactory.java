
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _InsertCovid_QNAME = new QName("http://services/", "InsertCovid");
    private final static QName _Covid_QNAME = new QName("http://services/", "covid");
    private final static QName _InsertCovidResponse_QNAME = new QName("http://services/", "InsertCovidResponse");
    private final static QName _InsertCovidList_QNAME = new QName("http://services/", "InsertCovidList");
    private final static QName _InsertCovidListResponse_QNAME = new QName("http://services/", "InsertCovidListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertCovidResponse }
     * 
     */
    public InsertCovidResponse createInsertCovidResponse() {
        return new InsertCovidResponse();
    }

    /**
     * Create an instance of {@link InsertCovidList }
     * 
     */
    public InsertCovidList createInsertCovidList() {
        return new InsertCovidList();
    }

    /**
     * Create an instance of {@link Covid }
     * 
     */
    public Covid createCovid() {
        return new Covid();
    }

    /**
     * Create an instance of {@link InsertCovidListResponse }
     * 
     */
    public InsertCovidListResponse createInsertCovidListResponse() {
        return new InsertCovidListResponse();
    }

    /**
     * Create an instance of {@link InsertCovid }
     * 
     */
    public InsertCovid createInsertCovid() {
        return new InsertCovid();
    }

    /**
     * Create an instance of {@link CovidPK }
     * 
     */
    public CovidPK createCovidPK() {
        return new CovidPK();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCovid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "InsertCovid")
    public JAXBElement<InsertCovid> createInsertCovid(InsertCovid value) {
        return new JAXBElement<InsertCovid>(_InsertCovid_QNAME, InsertCovid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Covid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "covid")
    public JAXBElement<Covid> createCovid(Covid value) {
        return new JAXBElement<Covid>(_Covid_QNAME, Covid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCovidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "InsertCovidResponse")
    public JAXBElement<InsertCovidResponse> createInsertCovidResponse(InsertCovidResponse value) {
        return new JAXBElement<InsertCovidResponse>(_InsertCovidResponse_QNAME, InsertCovidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCovidList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "InsertCovidList")
    public JAXBElement<InsertCovidList> createInsertCovidList(InsertCovidList value) {
        return new JAXBElement<InsertCovidList>(_InsertCovidList_QNAME, InsertCovidList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCovidListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "InsertCovidListResponse")
    public JAXBElement<InsertCovidListResponse> createInsertCovidListResponse(InsertCovidListResponse value) {
        return new JAXBElement<InsertCovidListResponse>(_InsertCovidListResponse_QNAME, InsertCovidListResponse.class, null, value);
    }

}

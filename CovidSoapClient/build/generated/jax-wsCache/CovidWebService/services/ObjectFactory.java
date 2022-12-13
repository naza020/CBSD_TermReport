
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
    private final static QName _ListByYear_QNAME = new QName("http://services/", "ListByYear");
    private final static QName _UpdateCovid_QNAME = new QName("http://services/", "UpdateCovid");
    private final static QName _ListAll_QNAME = new QName("http://services/", "ListAll");
    private final static QName _InsertCovidResponse_QNAME = new QName("http://services/", "InsertCovidResponse");
    private final static QName _ListByYearResponse_QNAME = new QName("http://services/", "ListByYearResponse");
    private final static QName _ListAllResponse_QNAME = new QName("http://services/", "ListAllResponse");
    private final static QName _ListByPk_QNAME = new QName("http://services/", "ListByPk");
    private final static QName _InsertCovidListResponse_QNAME = new QName("http://services/", "InsertCovidListResponse");
    private final static QName _ListByWeek_QNAME = new QName("http://services/", "ListByWeek");
    private final static QName _Covid_QNAME = new QName("http://services/", "covid");
    private final static QName _ListByWeekResponse_QNAME = new QName("http://services/", "ListByWeekResponse");
    private final static QName _DeleteCovidResponse_QNAME = new QName("http://services/", "DeleteCovidResponse");
    private final static QName _ListByPkResponse_QNAME = new QName("http://services/", "ListByPkResponse");
    private final static QName _InsertCovidList_QNAME = new QName("http://services/", "InsertCovidList");
    private final static QName _UpdateCovidResponse_QNAME = new QName("http://services/", "UpdateCovidResponse");
    private final static QName _DeleteCovid_QNAME = new QName("http://services/", "DeleteCovid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteCovidResponse }
     * 
     */
    public DeleteCovidResponse createDeleteCovidResponse() {
        return new DeleteCovidResponse();
    }

    /**
     * Create an instance of {@link ListByPkResponse }
     * 
     */
    public ListByPkResponse createListByPkResponse() {
        return new ListByPkResponse();
    }

    /**
     * Create an instance of {@link InsertCovidList }
     * 
     */
    public InsertCovidList createInsertCovidList() {
        return new InsertCovidList();
    }

    /**
     * Create an instance of {@link ListByWeek }
     * 
     */
    public ListByWeek createListByWeek() {
        return new ListByWeek();
    }

    /**
     * Create an instance of {@link Covid }
     * 
     */
    public Covid createCovid() {
        return new Covid();
    }

    /**
     * Create an instance of {@link ListByWeekResponse }
     * 
     */
    public ListByWeekResponse createListByWeekResponse() {
        return new ListByWeekResponse();
    }

    /**
     * Create an instance of {@link UpdateCovidResponse }
     * 
     */
    public UpdateCovidResponse createUpdateCovidResponse() {
        return new UpdateCovidResponse();
    }

    /**
     * Create an instance of {@link DeleteCovid }
     * 
     */
    public DeleteCovid createDeleteCovid() {
        return new DeleteCovid();
    }

    /**
     * Create an instance of {@link InsertCovidResponse }
     * 
     */
    public InsertCovidResponse createInsertCovidResponse() {
        return new InsertCovidResponse();
    }

    /**
     * Create an instance of {@link UpdateCovid }
     * 
     */
    public UpdateCovid createUpdateCovid() {
        return new UpdateCovid();
    }

    /**
     * Create an instance of {@link ListAll }
     * 
     */
    public ListAll createListAll() {
        return new ListAll();
    }

    /**
     * Create an instance of {@link InsertCovidListResponse }
     * 
     */
    public InsertCovidListResponse createInsertCovidListResponse() {
        return new InsertCovidListResponse();
    }

    /**
     * Create an instance of {@link ListByYearResponse }
     * 
     */
    public ListByYearResponse createListByYearResponse() {
        return new ListByYearResponse();
    }

    /**
     * Create an instance of {@link ListAllResponse }
     * 
     */
    public ListAllResponse createListAllResponse() {
        return new ListAllResponse();
    }

    /**
     * Create an instance of {@link ListByPk }
     * 
     */
    public ListByPk createListByPk() {
        return new ListByPk();
    }

    /**
     * Create an instance of {@link InsertCovid }
     * 
     */
    public InsertCovid createInsertCovid() {
        return new InsertCovid();
    }

    /**
     * Create an instance of {@link ListByYear }
     * 
     */
    public ListByYear createListByYear() {
        return new ListByYear();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListByYear")
    public JAXBElement<ListByYear> createListByYear(ListByYear value) {
        return new JAXBElement<ListByYear>(_ListByYear_QNAME, ListByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCovid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "UpdateCovid")
    public JAXBElement<UpdateCovid> createUpdateCovid(UpdateCovid value) {
        return new JAXBElement<UpdateCovid>(_UpdateCovid_QNAME, UpdateCovid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListAll")
    public JAXBElement<ListAll> createListAll(ListAll value) {
        return new JAXBElement<ListAll>(_ListAll_QNAME, ListAll.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListByYearResponse")
    public JAXBElement<ListByYearResponse> createListByYearResponse(ListByYearResponse value) {
        return new JAXBElement<ListByYearResponse>(_ListByYearResponse_QNAME, ListByYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListAllResponse")
    public JAXBElement<ListAllResponse> createListAllResponse(ListAllResponse value) {
        return new JAXBElement<ListAllResponse>(_ListAllResponse_QNAME, ListAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListByPk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListByPk")
    public JAXBElement<ListByPk> createListByPk(ListByPk value) {
        return new JAXBElement<ListByPk>(_ListByPk_QNAME, ListByPk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCovidListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "InsertCovidListResponse")
    public JAXBElement<InsertCovidListResponse> createInsertCovidListResponse(InsertCovidListResponse value) {
        return new JAXBElement<InsertCovidListResponse>(_InsertCovidListResponse_QNAME, InsertCovidListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListByWeek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListByWeek")
    public JAXBElement<ListByWeek> createListByWeek(ListByWeek value) {
        return new JAXBElement<ListByWeek>(_ListByWeek_QNAME, ListByWeek.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListByWeekResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListByWeekResponse")
    public JAXBElement<ListByWeekResponse> createListByWeekResponse(ListByWeekResponse value) {
        return new JAXBElement<ListByWeekResponse>(_ListByWeekResponse_QNAME, ListByWeekResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCovidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "DeleteCovidResponse")
    public JAXBElement<DeleteCovidResponse> createDeleteCovidResponse(DeleteCovidResponse value) {
        return new JAXBElement<DeleteCovidResponse>(_DeleteCovidResponse_QNAME, DeleteCovidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListByPkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListByPkResponse")
    public JAXBElement<ListByPkResponse> createListByPkResponse(ListByPkResponse value) {
        return new JAXBElement<ListByPkResponse>(_ListByPkResponse_QNAME, ListByPkResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCovidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "UpdateCovidResponse")
    public JAXBElement<UpdateCovidResponse> createUpdateCovidResponse(UpdateCovidResponse value) {
        return new JAXBElement<UpdateCovidResponse>(_UpdateCovidResponse_QNAME, UpdateCovidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCovid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "DeleteCovid")
    public JAXBElement<DeleteCovid> createDeleteCovid(DeleteCovid value) {
        return new JAXBElement<DeleteCovid>(_DeleteCovid_QNAME, DeleteCovid.class, null, value);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Covid;
import model.CovidPK;
import model.CovidTable;

/**
 *
 * @author theki
 */
@WebService(serviceName = "CovidWebService")
public class CovidWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "InsertCovidList")
    public String InsertCovidList(@WebParam(name = "data") List<Covid> data) {
        if (CovidTable.insertListCovid(data)) {
            return "Insert Covid List Complete";
        } else {
            return "Insert Covid List Error.Please try again.";
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "InsertCovid")
    public String InsertCovid(@WebParam(name = "data") Covid data) {
        if (CovidTable.insertCovid(data)) {
            return "Insert Covid Complete";
        } else {
            return "Insert Covid Error.Please try again.";
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListByYear")
    public List<Covid> ListByYear(@WebParam(name = "year") int year) {
        //TODO write your implementation code here:
        return CovidTable.findCovidByYear(year);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListByWeek")
    public List<Covid> ListByWeek(@WebParam(name = "week") int week) {
        //TODO write your implementation code here:
        return CovidTable.findCovidByWeek(week);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListByPk")
    public Covid ListByPk(@WebParam(name = "year") int year, @WebParam(name = "week") int week) {
        //TODO write your implementation code here:
        return CovidTable.findCovidByPk(new CovidPK(year,week));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListAll")
    public List<Covid> ListAll() {
        //TODO write your implementation code here:
        return CovidTable.findAllCovid();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateCovid")
    public String UpdateCovid(@WebParam(name = "data") Covid data) {
        if (CovidTable.updateCovid(data)) {
            return "Update Covid Complete";
        } else {
            return "Update Covid Error.Please try again.";
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DeleteCovid")
    public String DeleteCovid(@WebParam(name = "data") Covid data) {
        if (CovidTable.removeCovid(data)) {
            return "Delete Covid Complete";
        } else {
            return "Delete Covid Error.Please try again.";
        }
    }
    
    

    

    
}

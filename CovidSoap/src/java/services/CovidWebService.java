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
        //TODO write your implementation code here:
//         boolean check=CovidTable.insertListCovid(data);
        System.out.println("Data:" + data);
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
        System.out.println("Data:" + data);
        if (CovidTable.insertCovid(data)) {

            return "Insert Covid Complete";
        } else {
            return "Insert Covid Error.Please try again.";
        }
    }

    /**
     * Web service operation
     */
//    @WebMethod(operationName = "InsertCovidList")
//    public String InsertCovidList(@WebParam(name = "data") List<Covid> data) {
//        //TODO write your implementation code here:
//        boolean check=CovidTable.insertListCovid(data);
//        if (check){
//            return "Insert Covid List Complete";
//        }else{
//            return "Insert Covid List Error.Please try again.";
//        }
//        
//    }
    /**
     * This is a sample web service operation
     */
//    @WebMethod(operationName = "hello")
//    public String hello(@WebParam(name = "name") String txt) {
//        return "Hello " + txt + " !";
//    }
}

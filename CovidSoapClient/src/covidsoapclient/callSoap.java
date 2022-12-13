/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidsoapclient;

import services.Covid;

/**
 *
 * @author theki
 */
public class callSoap {

    public static void printCovid(Covid data) {
        System.out.print(data.getCovidPK().getYears() + "|");
        System.out.print(data.getCovidPK().getWeeknum() + "|");
        System.out.print(data.getNewCase() + "|");
        System.out.print(data.getTotalCase() + "|");
        System.out.print(data.getNewCaseExcludeabroad() + "|");
        System.out.print(data.getTotalCaseExcludeabroad() + "|");
        System.out.print(data.getNewRecovered() + "|");
        System.out.print(data.getTotalRecovered() + "|");
        System.out.print(data.getNewDeath()+ "|");
        System.out.print(data.getTotalDeath() + "|");
        System.out.print(data.getCaseForeign() + "|");
        System.out.print(data.getCasePrison() + "|");
        System.out.print(data.getCaseWalkin() + "|");
        System.out.print(data.getCaseNewPrev() + "|");
        System.out.print(data.getCaseNewDiff() + "|");
        System.out.print(data.getDeathNewPrev() + "|");
        System.out.print(data.getDeathNewDiff() + "|");
        System.out.println(data.getUpdateDate());
    }

    public static String insertCovidList(java.util.List<services.Covid> data) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.insertCovidList(data);
    }

    public static String insertCovid(services.Covid data) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.insertCovid(data);
    }

    public static String updateCovid(services.Covid data) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.updateCovid(data);
    }

    public static String deleteCovid(services.Covid data) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.deleteCovid(data);
    }

    public static java.util.List<services.Covid> listAll() {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.listAll();
    }

    public static Covid listByPk(int year, int week) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.listByPk(year, week);
    }

    public static java.util.List<services.Covid> listByWeek(int week) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.listByWeek(week);
    }

    public static java.util.List<services.Covid> listByYear(int year) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.listByYear(year);
    }

}

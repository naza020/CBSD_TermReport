/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidsoapclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import services.Covid;
import services.CovidPK;

/**
 *
 * @author theki
 */
public class CovidSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DatatypeConfigurationException {
        // TODO code application logic here
        insertDataList();
//        System.out.println("List All");
//        listAll();
//        System.out.println("List By Year");
//        listByYear(2021);
//        System.out.println("List By Week");
//        listByWeek(13);
//        System.out.println("List By PK");
//        listByPk(2021,15);

//        insertData();

        //update data year=2021 week=13
//           updateData();
//           listAll();
        //delete data that appear after use func insertData();
//        deleteData();
//        System.out.println("");
//        System.out.println("");
//        deleteData();
    }

    public static void listAll() {
        System.out.println("List All");
        List<Covid> coList = callSoap.listAll();
        for (Covid co : coList) {
            callSoap.printCovid(co);
        }
    }

    public static void listByYear(int year) {
        System.out.println("List By Year = " + year);
        List<Covid> coList = callSoap.listByYear(year);
        for (Covid co : coList) {
            callSoap.printCovid(co);
        }
    }

    public static void listByWeek(int week) {
        System.out.println("List By Week = " + week);
        List<Covid> coList = callSoap.listByWeek(week);
        for (Covid co : coList) {
            callSoap.printCovid(co);
        }
    }

    public static void listByPk(int year, int week) {
        callSoap.printCovid(callSoap.listByPk(year, week));
    }

    public static void updateData() {
        Covid co = callSoap.listByPk(2021, 13);
        System.out.println("Before Update");
        callSoap.printCovid(co);
        co.setNewCase(10000);
        System.out.println("After Update");
        System.out.println(callSoap.updateCovid(co));
        Covid response = callSoap.listByPk(2021, 13);
        callSoap.printCovid(response);
    }

    public static void deleteData() {
        Covid co = callSoap.listByPk(2020, 15);
        if (co != null) {
            List<Covid> temp = callSoap.listAll();
            System.out.println("Before Delete:Count = " + temp.size());
            callSoap.printCovid(co);
            System.out.println(callSoap.deleteCovid(co));
            temp = callSoap.listAll();
            System.out.println("After Delete:Count = " + temp.size());
        } else {
            System.out.println("Data Not Found");
        }

    }

    public static void insertData() throws DatatypeConfigurationException {
        List<Covid> temp = callSoap.listAll();
        System.out.println("Before Insert :Count =" + temp.size());
        Covid newRow = new Covid();
        CovidPK pk = new CovidPK();
        pk.setYears(2020);
        pk.setWeeknum(15);
        newRow.setCovidPK(pk);
        newRow.setNewCase(8927);
        newRow.setTotalCase(40585);
        newRow.setNewCaseExcludeabroad(8890);
        newRow.setTotalCaseExcludeabroad(37353);
        newRow.setNewRecovered(409);
        newRow.setTotalRecovered(28570);
        newRow.setNewDeath(3);
        newRow.setTotalDeath(100);
        newRow.setCaseForeign(37);
        newRow.setCasePrison(0);
        newRow.setCaseWalkin(6175);
        newRow.setCaseNewPrev(8169);
        newRow.setCaseNewDiff(758);
        newRow.setDeathNewPrev(4);
        newRow.setDeathNewDiff(-1);
        GregorianCalendar tempDate = new GregorianCalendar();
        tempDate.set(2022, 12, 14);
        XMLGregorianCalendar finalDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(tempDate);
        newRow.setUpdateDate(finalDate);
        System.out.println(callSoap.insertCovid(newRow));
        temp = callSoap.listAll();
        System.out.println("After Insert :Count =" + temp.size());
    }

    public static void insertDataList() {
        List<Covid> covidList = new ArrayList<Covid>();;
        try {
            URL url = new URL("https://covid19.ddc.moph.go.th/api/Cases/report-round-3-y21-line-lists");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
//            int status = con.getResponseCode();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();
            JsonReader reader = Json.createReader(new StringReader(content.toString()));
            JsonObject jsonst = reader.readObject();
            JsonArray coList = jsonst.getJsonArray("data");
            for (JsonValue val : coList) {
//                Covid temp = jsonToCovid(val);
                int year = val.asJsonObject().getInt("year");
                int weeknum = val.asJsonObject().getInt("weeknum");
                Covid temp = new Covid();
                CovidPK coPk = new CovidPK();
                coPk.setYears(year);
                coPk.setWeeknum(weeknum);
                temp.setCovidPK(coPk);
//                    System.out.println(i + ":Covid:" + temp.toString());
                Date cDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH)
                        .parse(val.asJsonObject().getString("update_date"));

//                    System.out.println(i + ":Date:" + cDate);
                GregorianCalendar tempDate = new GregorianCalendar();
                tempDate.setTime(cDate);
                XMLGregorianCalendar finalDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(tempDate);
///
                temp.setNewCase(val.asJsonObject().getInt("new_case"));
                temp.setTotalCase(val.asJsonObject().getInt("total_case"));
                temp.setNewCaseExcludeabroad(val.asJsonObject().getInt("new_case_excludeabroad"));
                temp.setTotalCaseExcludeabroad(val.asJsonObject().getInt("total_case_excludeabroad"));
                temp.setNewRecovered(val.asJsonObject().getInt("new_recovered"));
                temp.setTotalRecovered(val.asJsonObject().getInt("total_recovered"));
                temp.setNewDeath(val.asJsonObject().getInt("new_death"));
                temp.setTotalDeath(val.asJsonObject().getInt("total_death"));
                temp.setCaseForeign(val.asJsonObject().getInt("case_foreign"));
                temp.setCasePrison(val.asJsonObject().getInt("case_prison"));
                temp.setCaseWalkin(val.asJsonObject().getInt("case_walkin"));
                temp.setCaseNewPrev(val.asJsonObject().getInt("case_new_prev"));
                temp.setCaseNewDiff(val.asJsonObject().getInt("case_new_diff"));
                temp.setDeathNewPrev(val.asJsonObject().getInt("death_new_prev"));
                temp.setDeathNewDiff(val.asJsonObject().getInt("death_new_diff"));
                temp.setUpdateDate(finalDate);
                covidList.add(temp);
            }
            System.out.println("Size:" + covidList.size());
            String result = callSoap.insertCovidList(covidList);
            System.out.println(result);
        } catch (MalformedURLException ex) {
            Logger.getLogger(CovidSoapClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CovidSoapClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CovidSoapClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(CovidSoapClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

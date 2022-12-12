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
    public static void main(String[] args) {
        // TODO code application logic here
        insertData();
    }

    public static void insertData() {
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
            String result = insertCovidList(covidList);
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

    

    private static String insertCovidList(java.util.List<services.Covid> data) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.insertCovidList(data);
    }

}

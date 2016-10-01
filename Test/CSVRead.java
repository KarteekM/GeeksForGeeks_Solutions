import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

import org.json.JSONObject;




import com.google.code.geocoder.Geocoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
public class CSVRead {
 
  public static void main(String[] args) {
 
	  CSVRead obj = new CSVRead();
	obj.run();
 
  }
  public void run() {
	  
		//String csvFile = "/Users/mkyong/Downloads/GeoIPCountryWhois.csv";
		String  csvFile ="C:\\Users\\home\\Downloads\\example.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		String []details = new String[3];
	 
		try {
	 
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
	 	
			   //System.out.println(line);
			   details = line.split(cvsSplitBy);
			   
			   //System.out.println(details[1]);
			   
			   String location = getAddress(details[1]+","+details[2]);
			   if(location == "Err" || location ==null)
				   return;
			   //System.out.println("Final location is "+location);
			   
			 String x=  getTime(details[1],details[2]);
			 //System.out.println(x);
			 if(x == "Err" || x ==null)
				   return;
			   System.out.println(line +","+location+","+x);
			}
			
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	 
		
	  }
	 
  public static String getAddress(String latlong){
	  String address = null;
	  String gURL = "http://maps.google.com/maps/api/geocode/xml?latlng=" + latlong + "&sensor=true"; 
	  try {
	  DocumentBuilderFactory df = DocumentBuilderFactory.newInstance();
	  DocumentBuilder db = df.newDocumentBuilder();
	  Document dom = db.parse(gURL);
	  Element docEl = dom.getDocumentElement();
	  NodeList nl = docEl.getElementsByTagName("result");
	  if (nl != null && nl.getLength() > 0){
	  address=((Element)nl.item(0)).getElementsByTagName("formatted_address").item(0).getTextContent();
	  for(int i=0;i<nl.getLength();i++){
	  String temp=((Element)nl.item(i)).getElementsByTagName("formatted_address").item(0).getTextContent();
	  }
	  }
	  } catch (Exception ex) {
	  address = "Err";
	  }
	  return address;
	  }
  
  public static String getTime(String lat,String longi){
	  String address = null;
	  String gURL = "http://www.earthtools.org/timezone/"+lat+"/"+longi;
	  try {
	  DocumentBuilderFactory df = DocumentBuilderFactory.newInstance();
	  DocumentBuilder db = df.newDocumentBuilder();
	  Document dom = db.parse(gURL);
	  Element docEl = dom.getDocumentElement();
	  address = docEl.getElementsByTagName("utctime").item(0).getTextContent();	  
	  } catch (Exception ex) {
	  address = "Err";
	  }
	  return address;
	  }
 
 
}

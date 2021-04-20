package ovApp;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONExample
{
	@SuppressWarnings("unchecked")
	public ReadJSONExample()
	{
		//JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();
		
		try(FileReader reader = new FileReader("stations.json"))
		{
			 //Read JSON file
			Object obj = jsonParser.parse(reader);
			
			JSONArray routesList = (JSONArray) obj;

			System.out.println(routesList);
			 //Iterate over employee array
			routesList.forEach(emp -> parseRoutesObject( (JSONObject) emp));
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void parseRoutesObject(JSONObject routes)
	{
		JSONObject routesObject = (JSONObject) routes.get("station");
        
        //Get station name
        String stationName = (String) routesObject.get("name");    
        System.out.println(stationName);
         
        //Get endstation
        String endStation = (String) routesObject.get("endStation");  
        System.out.println(endStation);
         
        //Get departure time
        String departure = (String) routesObject.get("departure");    
        System.out.println(departure + "\n");
        
     
	}
}

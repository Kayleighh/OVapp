package ovApp;

import java.util.ArrayList;

public class Routes
{
	 ArrayList<String> routes = new ArrayList<String>();
	    public Routes()
	    {
	        routes.add("zwolle-emmen");
	        routes.add("Almelo-Hardenberg");

	    }

	    public void searchRoute(String findRoute)
	    {
	        for(String element : routes)
	        {
	            if(element.contains(findRoute))
	            {
	                System.out.println(element);
	            }
	        }
	    }
}

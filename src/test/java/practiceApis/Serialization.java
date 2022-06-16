package practiceApis;

import java.util.ArrayList;
import java.util.List;

import pojo.Address;
import pojo.Location;

public class Serialization {


	
public  Address ser()
{
	
	Address a= new Address();
	a.setAccuracy(1);
	a.setName("maddy");
	a.setPhone_number(44444);
    a.setAddress("noida ext");
    a.setWebsite("null");
    a.setLanguage("lang");
    
    List<String> l= new ArrayList<String>();
    l.add("L1");
    l.add("L2");
    a.setTypes(l);
    
    Location l1=new Location();
    
    l1.setLat(23.33);
    l1.setLng(54.33);

    a.setLocation(l1);
    
    return a;
	
	
}
}

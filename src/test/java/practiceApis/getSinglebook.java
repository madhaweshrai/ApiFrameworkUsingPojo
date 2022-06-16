package practiceApis;



import org.testng.annotations.DataProvider;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import pojo.getbook;

public class getSinglebook {

	Serialization s= new Serialization();
	
	@Test()
	public void testget()
	{
		//De serialize
		
		getbook gb=given().header("Contect-TYpe","application/json").when().get("https://reqres.in/api/unknown/2").as(getbook.class);
		System.out.println(gb.getData().getId()+" "+gb.getSupport().getUrl());
		System.out.println("all resp "+gb);
		
		//body resp
		/*
		 * { "data": { "id": 2, "name": "fuchsia rose", "year": 2001, "color":
		 * "#C74375", "pantone_value": "17-2031" },
		 *  "support": 
		 *  { "url":"https://reqres.in/#support-heading",
		 *   "text":"To keep ReqRes free, contributions towards server costs are appreciated!" }
		 * }
		 */
	}
	
	/*
	 * @Test public void serilz() { //serialize
	 * 
	 * System.out.println(s.ser().toString()+"  reqqqq"); String
	 * resp=given().header("Contect-TYpe","application/json").queryParam("key",
	 * "qaclick123").body(s.ser()).when().
	 * post("https://rahulshettyacademy.com/maps/api/place/add/json?key= qaclick123"
	 * ).then().statusCode(200) .extract().response().asString();
	 * 
	 * 
	 * System.out.println(resp);
	 * 
	 * 
	 * }
	 */
}

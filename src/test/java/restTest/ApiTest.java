package restTest;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import restapi3.BaseTest;
import restclient.Restclient;


public class ApiTest extends BaseTest
{
	BaseTest test;
	String urll;
@BeforeMethod
public void setup()
{
   test=new BaseTest();
   String mainurl = prop.getProperty("url");
   String serverurl = prop.getProperty("Serviceurl");
   
    urll=mainurl+ serverurl;
}
@Test
public void getTest() 
{
	Restclient t=new Restclient();
	try {
		t.get(urll);
	} catch (ClientProtocolException e) 
	{
		e.printStackTrace();
	} catch (IOException e) 
	{
		e.printStackTrace();
	}
}

}

package restclient;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class Restclient 
{
	//1.get methode
public void get(String url) throws ClientProtocolException, IOException
{
	CloseableHttpClient clientt = HttpClients.createDefault();
	HttpGet get=new HttpGet(url);
	//status code
	CloseableHttpResponse response = clientt.execute(get);
	int status = response.getStatusLine().getStatusCode();
	System.out.println(status);
	
	//json String
	String respond = EntityUtils.toString(response.getEntity(),"UTF-8");
	JSONObject json=new JSONObject(respond);
	System.out.println("response json from api  "+ json);
	
	//headers
	Header[] head = response.getAllHeaders();
	HashMap<String, String> allheadrs=new HashMap<String, String>();
	for(Header h:head)
	{
		allheadrs.put(h.getName(),h.getValue());
	}
	System.out.println(allheadrs);
}
}

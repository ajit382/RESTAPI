package restapi3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest 
{
public Properties prop;

public BaseTest() 
{
	prop=new Properties();
	FileInputStream fp;
	try
	{
		fp = new FileInputStream("E:/Javawork/restapi/src/main/java/api/config/apiProperties");
		prop.load(fp);
	} 
	catch (FileNotFoundException e)
	{
		e.printStackTrace();
	} 
	catch (IOException e)
	{
		e.printStackTrace();
	}
}

}

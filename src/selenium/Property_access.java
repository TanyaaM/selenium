package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_access {

	public static void main(String[] args) throws IOException {
	
		String x=GetPropValue("URL");
		System.out.println(x);
	}
	public static String GetPropValue(String PName)//WE ARE PASSING THE NAME OF PROPERTY
	{
		String PValue=null;
		try{
			Properties prop=new Properties();
			String path=System.getProperty("user.dir");
			FileInputStream ft=new FileInputStream(path+"\\src\\Config.properties");
			prop.load(ft);//LINKING TO THE PROPERTY FILE
			PValue=prop.getProperty(PName);
		}catch(Exception e){
			System.out.println("some error"+e.getMessage());
		}
		return PValue;
	
	}

}

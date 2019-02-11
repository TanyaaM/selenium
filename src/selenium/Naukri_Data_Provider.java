package selenium;

import org.testng.annotations.DataProvider;

public class Naukri_Data_Provider {
	
	@DataProvider(name="NaukriSearchData")
	
public Object[][] registerData(){
		
		Object[][] data=new Object[3][4];
		
		//first row
		data[0][0]="Software Testing";
		data[0][1]="Chandigarh";
		data[0][2]=5;
		data[0][3]=4;
		
		//Second row
		
		data[1][0]="Software Development";
		data[1][1]="Delhi";
		data[1][2]=5;
		data[1][3]=9;
		
		//third row
		data[2][0]="Automation Testing";
		data[2][1]="Delhi";
		data[2][2]=3;
		data[2][3]=9;
		
		return data;

}
}
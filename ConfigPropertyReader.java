
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
/**
 * @author suba
 *
 */
public class ConfigPropertyReader 
{
	Properties pro ;
	public ConfigPropertyReader(){
		try {
			File src= new File("./Configuration/Config.property");
			FileInputStream fis= new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (Exception e){
			System.out.println("Exception - " +e.getMessage());
		} 
	}
	
	
		
	public String getBaseUrl()	{
		return pro.getProperty("baseUrl");		
	}

	public long getObjectToload(){
		return Long.parseLong(pro.getProperty("objectToload"));		
	}	
	
	public long getPageToload()	{
		return Long.parseLong(pro.getProperty("pageToload"));		
	}	
	
	public String getExcelPath(){
		return pro.getProperty("excelPath");
	}
}

import ConfigPropertyReader;// import your ConfigPropertyReader class
/**
 * @author suba
 *
 */
public class Test
{
	public static void main(String[] args) {
        ConfigPropertyReader _config = new ConfigPropertyReader();
        String baseUrl = _config.getBaseUrl(); 
        System.out.println("base url : "+baseUrl); // Output==> base url : https://www.google.lk/
	}
}
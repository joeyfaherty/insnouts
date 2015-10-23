package insnouts;


	
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
	 
	/**
	 * @author joey
	 * 
	 */
	public class RetrieveExpenseFromProperties {
		
		InputStream inputStream;
		String xxx = "";
	 
		public String getPropValues() throws IOException {
	 
			try {
				Properties prop = new Properties();
				String propertiesFileName = "config.properties";
	 
				inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFileName);
	 
				if (inputStream != null) {
					prop.load(inputStream);
				} else {
					throw new FileNotFoundException("property file '" + propertiesFileName + "' not found in the classpath");
				}
				xxx = prop.getProperty("expense.home.rent");
			} catch (Exception e) {
				System.out.println("Exception: " + e);
			} finally {
				inputStream.close();
			}
			return xxx;
		}
	}

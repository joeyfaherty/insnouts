package insnouts;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
	 
	/**
	 * @author joey
	 * TODO: Actual expense calculations from prop file
	 * TODO: put jar in libs/ foler in tar
	 * TODO: create script to untar, cd to dir, execute etc.
	 * 
	 */
	public class LoadProperties {
		
		InputStream inputStream = null;
		String propertyValue = "";
		
		public static void main(String [] args) throws IOException {
			System.out.println("Starting expense calculator...");
			LoadProperties properties = new LoadProperties();
			System.out.println(properties.getPropValues());
		}
	 
		public String getPropValues() throws IOException {
			Properties prop = new Properties();
			InputStream input = null;

			try {
				input = new FileInputStream("./config/config.properties");
				
				// load the properties file
				prop.load(input);

			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			// get the property value and return it
			return prop.getProperty("expense.home.rent");
		}
		
	}

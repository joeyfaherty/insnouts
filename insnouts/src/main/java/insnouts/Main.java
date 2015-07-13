package insnouts;

import java.io.IOException;

public class Main {
	
	public static void main(String [] args) throws IOException {
		RetrieveExpenseFromProperties properties = new RetrieveExpenseFromProperties();
		properties.getPropValues();
	}
}

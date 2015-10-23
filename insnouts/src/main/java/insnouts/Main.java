package insnouts;

import java.io.IOException;

public class Main {
	
	public static void main(String [] args) throws IOException {
		System.out.println("Starting expense calculator...");
		RetrieveExpenseFromProperties properties = new RetrieveExpenseFromProperties();
		System.out.println(properties.getPropValues());
	}
}

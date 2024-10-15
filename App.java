package week05;

public class App {

	public static void main(String[] args) {
		
	Logger logger = new AsteriskLogger();
		
	logger.log("Hello");
		
		
		System.out.println("\n");
		
		
	Logger logger2 = new AsteriskLogger();
	
	logger2.error("Hello");
	
	
		System.out.println("\n");
	
	
	Logger logger3 = new SpacedLogger();
	
	logger3.log("Hello");
	
	
		System.out.println("\n");
		
	Logger logger4 = new SpacedLogger();
	
	logger4.error("Hello");
	
	
	
	
		
		}
	}


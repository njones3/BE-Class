package codingproject;

public class App {

	public static void main(String[] args) {
		
		Logger asterickLogger = new AsterickLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asterickLogger.log("Hello");
		
		asterickLogger.error("Hello!");
		
		spacedLogger.log("Hello");
		
		spacedLogger.error("Hello!");

	}

}

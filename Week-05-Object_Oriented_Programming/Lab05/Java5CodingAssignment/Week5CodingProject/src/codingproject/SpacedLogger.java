package codingproject;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		StringBuilder message = new StringBuilder();
		for (char character : log.toCharArray()) {
			message.append(character).append(" ");			
		}
		System.out.println(message);
	}

	@Override
	public void error(String error) {
		StringBuilder message = new StringBuilder();
		for (char character : error.toCharArray()) {
			message.append(character).append(" ");			
		}
		System.out.println("ERROR: " + message);
		
	}

}

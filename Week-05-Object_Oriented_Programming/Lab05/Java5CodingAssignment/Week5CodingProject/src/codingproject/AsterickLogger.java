package codingproject;

import java.util.Date;

public class AsterickLogger implements Logger {

	@Override
	public void log(String log) {
		
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		
		System.out.println("******************" + "\n***ERROR:" + error + "***" + "\n******************");
		
	}

}

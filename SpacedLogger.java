package week05;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		//String logResults = "";
		//for (int i = 0; i < log.length(); i++) {
			//logResults += log.charAt(i) + " ";
		//}
		
		//System.out.println(logResults);
		
	//-------------------------------------------------------------------------------------------------	
		
		//System.out.println(log.replaceAll(".(?=.)", "$0 "));
		
	//-------------------------------------------------------------------------------------------------
		
		//System.out.println(log.replace("", " ").trim());
		
	//-------------------------------------------------------------------------------------------------
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			if (i > 0) {
				result.append(" ");
			}
			
			result.append(log.charAt(i));
		}
		
		System.out.println(result.toString());
		
		
	}

	@Override
	public void error(String error) {
		System.out.println("ERROR:" + error.replace("", " ").trim());
		
	}

}

package util;
import java.io.*;
/**
 * 
 * @author Michael Sante
 * This class was provided by professor to read in 
 * various types of data input after printing a prompt.
 */
public class KeyboardReader {

	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public KeyboardReader() { }
	  
	  public static String getPromptedString(String prompt) {
	    String response = null;
	    System.out.print(prompt);
	    try {
	      response = in.readLine();
	    } catch (IOException e) {
	      System.out.println("IOException occurred");
	    }
	    return response;
	  }
	  
	  public static char getPromptedChar(String prompt) {
	    return getPromptedString(prompt).charAt(0);
	  }
	  /**
	   * Overloaded the getPromptedChar() method to return an error message
	   * if the the provided input does not match the prompt ('Y', 'y', 'N', or 'n').
	   * @param prompt Prompts user for a response.
	   * @param errMsg Error message if the input does not match the requested input.
	   * @param val Accepts an instance of the YesNoValidator class as a 
	   * CharValidator object in order to use its method, which tests the input against 
	   * the requested input ('Y', 'y', 'N', or 'n').
	   * @return char
	   */
	  public static char getPromptedChar(String prompt, String errMsg, CharValidator val) {
		  for ( ; ; ) {
			  char YesNo = getPromptedString(prompt).charAt(0);
			  if (val.accept(YesNo)) return YesNo;
			  else System.out.println(errMsg);
		  }
	  }

	  public static int getPromptedInt(String prompt) {
		  int response = 0;
		  try {
			  response = Integer.parseInt(getPromptedString(prompt));
		  }
		  catch (NumberFormatException e) {
			  System.out.println("Department number must be an integer");
		  }
		  return response;
	  }
	  
	  public static int getPromptedInt(String prompt, String errMsg) {
		  for ( ; ; ) {
			  try {
				  return Integer.parseInt(getPromptedString(prompt));
			  } catch (NumberFormatException nfe) {
				  System.out.println(errMsg);
			  }
		  }
	  }
	  /**
	   * Prompts user for an integer and sends an error message if an exception occurs
	   * or if the integer does not pass a validation test.
	   * @param prompt Prompts user for input.
	   * @param errMsg1 Exception error message.
	   * @param val Will test integer against a condition specified in a class
	   * that implements IntValidator.
	   * @param errMsg2 Error message if passed in input fails IntValidator test.
	   * @return int
	   */
	  public static int getPromptedInt(String prompt, String errMsg1, IntValidator val, String errMsg2) {
		  for ( ; ; ) {
			  try { 
				  int num = Integer.parseInt(getPromptedString(prompt));
				  if (val.accept(num)) return num;
				  else System.out.println(errMsg2);
			  } catch (NumberFormatException nfe) {
				  System.out.println(errMsg1);
			  }
		  }
	  }
	  
	  public static float getPromptedFloat(String prompt) {
	    return Float.parseFloat(getPromptedString(prompt));
	  }
	  
	  public static float getPromptedFloat(String prompt, String errMsg) {
		  for ( ; ; ) {
			  try {
				  return Float.parseFloat(getPromptedString(prompt));
			  } catch (NumberFormatException nfe) {
				  System.out.println(errMsg);
			  }
		  }
	  }
	  
	  public static double getPromptedDouble(String prompt) {
	    return Double.parseDouble(getPromptedString(prompt));
	  }
	  
	  public static double getPromptedDouble(String prompt, String errMsg) {
		  for ( ; ; ) {
			  try {
				  return Double.parseDouble(getPromptedString(prompt));
			  } catch (NumberFormatException nfe) {
				  System.out.println(errMsg);
			  }
		  }
	  }

}


package util;
/**
 * 
 * @author Michael Sante
 * Interface for the accept() method that tests
 * a char input against conditions specified in the classes
 * that implement this.
 */
public interface CharValidator {
	public boolean accept(char candidate);
}

package school;
import util.*;
/**
 * 
 * @author Michael Sante
 * Tests the validation of a classroom number.
 */
public class ClassroomValidator implements IntValidator {
	/**
	 * Returns false if the int passed in is not >= 100.
	 */
	@Override
	public boolean accept(int classroom) {
		return classroom >= 100;
	}
	
}

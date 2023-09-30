package school;
import util.*;
/**
 * 
 * @author Michael Sante
 * Tests the validation of a student ID number.
 */
public class StudentIdValidator implements IntValidator {
	/**
	 * Returns false if the int passed in is not > 0.
	 */
	@Override
	public boolean accept(int studentId) {
		return studentId > 0;
	}
}

package school;
import util.*;
/**
 * 
 * @author Michael Sante
 * Tests the validation of a student's final grade.
 */
public class FinalGradeValidator implements IntValidator {
	/**
	 * Returns false if the int passed in is not between
	 * (or including) 0 and 100.
	 */
	@Override
	public boolean accept(int finalGrade) {
		return finalGrade >= 0 && finalGrade <= 100;
	}
}

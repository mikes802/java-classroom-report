package school;
import util.*;
/**
 * 
 * @author Michael Sante
 * Tests the validation of a yes/no response.
 */
public class YesNoValidator implements CharValidator {
	/**
	 * Returns false if the char passed in is not a "yes" ('Y', 'y')
	 * or a "no" ('N', 'n').
	 */
	@Override
	public boolean accept(char YesNo) {
		return YesNo == 'Y' || YesNo == 'y' || YesNo == 'N' || YesNo == 'n';
	}
}

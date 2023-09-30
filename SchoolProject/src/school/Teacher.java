package school;
import util.Displayable;
/**
 * 
 * @author Michael Sante
 * Represents a Teacher at the school.
 */
public class Teacher extends Person implements Displayable {
	/**
	 * Subject taught by the teacher.
	 */
	private String subject;
	/**
	 * Creates a Teacher instance.
	 */
	public Teacher () {};
	/**
	 * Creates a Teacher instance.
	 * @param firstName Teacher's first name.
	 * @param lastName Teacher's last name.
	 * @param subject Subject taught by the teacher.
	 */
	public Teacher (String firstName, String lastName, String subject) {
		super(firstName, lastName);
		setSubject(subject);
	}
	/**
	 * Sets the subject taught by the teacher.
	 * @param subject Subject taught by the teacher.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * Retrieves the subject taught by the teacher.
	 * @return Subject taught by the teacher.
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * The display() method from Displayable interface,
	 * overridden here to display the full name of the teacher
	 * concatenated with the subject taught by the teacher.
	 */
	@Override
	public String display() {
		return getFullName() + " teaches " + subject;
	}
	
	
}

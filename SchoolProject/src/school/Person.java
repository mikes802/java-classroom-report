package school;
/**
 * 
 * @author Michael Sante
 * Represents a Person at the school.
 */
public abstract class Person {
	/**
	 * Person's first name.
	 */
	private String firstName;
	/**
	 * Person's last name.
	 */
	private String lastName;
	/**
	 * Creates a Person instance.
	 */
	public Person() {}
	/**
	 * Creates a Person instance.
	 * @param firstName Person's first name.
	 * @param lastName Person's last name.
	 */
	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	/**
	 * Sets a person's first name.
	 * @param firstName Person's first name.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Sets a person's last name.
	 * @param lastName Person's last name.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * Retrieves a person's first name.
	 * @return Person's first name.
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * Retrieves a person's last name.
	 * @return Person's first name.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Retrieves a person's full name.
	 * @return Person's full name.
	 */
	public String getFullName() {
		return firstName + " " + lastName;
	}
}


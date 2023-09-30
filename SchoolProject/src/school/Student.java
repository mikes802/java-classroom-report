package school;
import util.Displayable;
/**
 * 
 * @author Michael Sante
 * Represents a Student at the school.
 */
public class Student extends Person implements Displayable {
	/**
	 * Student ID number (>0).
	 */
	private int studentId;
	/**
	 * Student's final grade (0-100).
	 */
	private int finalGrade;
	/**
	 * Creates a Student instance.	
	 */
	public Student() {};
	/**
	 * Create's a Student instance.
	 * @param firstName Student's first name.
	 * @param lastName Student's last name.
	 * @param studentId Student ID number.
	 * @param finalGrade Student's final grade (0-100).
	 */
	public Student(String firstName, String lastName, int studentId, int finalGrade) {
		super(firstName, lastName);
		setStudentId(studentId);
		setFinalGrade(finalGrade);
	}
	/**
	 * Sets student's final grade (0-100).
	 * @param finalGrade Student's final grade (0-100).
	 */
	public void setFinalGrade(int finalGrade) {
		this.finalGrade = finalGrade;
	}
	/**
	 * Retrieves student's final grade (0-100).
	 * @return Student's final grade (0-100).
	 */
	public int getFinalGrade() {
		return finalGrade;
	}
	/**
	 * Sets student ID number (>0).
	 * @param studentId Student ID number (>0).
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * Retrieves student ID number (>0).
	 * @return Student ID number (>0).
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * Method to pad output so that it lines up in a column.	
	 * @param s Input String.
	 * @param n Number of spaces to pad.
	 * @return Output String formatted to include right pad.
	 */
	public static String padRight(String s, int n) {
		return String.format("%-" + n + "s", s);
	}
	/**
	 * The display() method from Displayable interface,
	 * overridden here to display the student ID number
	 * concatenated with the student's full name and final grade.
	 */
	@Override
	public String display() {
		return "Student ID: "+ padRight(String.valueOf(studentId), 3) + "   " + padRight(getFullName(), 16) + "   Final Grade: " + finalGrade;
	}
}

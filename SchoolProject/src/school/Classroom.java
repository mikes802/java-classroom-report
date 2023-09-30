package school;
import java.util.ArrayList;
import util.Displayable;
/**
 * 
 * @author Michael Sante
 * Represents a Classroom at the school.
 */
public class Classroom implements Displayable {
	/**
	 * Classroom number (>100).
	 */
	private int roomNumber;
	/**
	 * An instance of Teacher stored as a Displayable object.
	 */
	Displayable teacher;
	/**
	 * An array list of Student instances.
	 */
	ArrayList<Displayable> students;
	/**
	 * Creates a Classroom instance.
	 */
	public Classroom() {};
	/**
	 * Creates a Classroom instance.
	 * @param roomNumber Classroom number (>100).
	 * @param teacher An instance of Teacher stored as a Displayable object.
	 * @param students An array list of Student instances.
	 */
	public Classroom(int roomNumber, Displayable teacher, ArrayList<Displayable> students) {
		setRoomNumber(roomNumber);
		this.teacher = teacher;
		this.students = students;
	}
	/**
	 * Sets the classroom number.
	 * @param roomNumber
	 */
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	/**
	 * Retrieves the classroom number.
	 * @return Classroom number (>100).
	 */
	public int getRoomNumber() {
		return roomNumber;
	}
	/**
	 * The display() method from Displayable interface,
	 * overridden here to display the classroom number and append it
	 * with the output from the display() method in the teacher variable,
	 * and iterate through the student array list, appending the output
	 * from the display() method of each Student object.
	 */
	@Override
	public String display() {
		
		StringBuffer result = new StringBuffer("Room Number: " + roomNumber + "\n" + teacher.display() + "\n");
		for (Displayable student : students) {
			result.append(student.display()).append("\n");
		}
		
		String str = result.toString(); 
		return str;
	}
}

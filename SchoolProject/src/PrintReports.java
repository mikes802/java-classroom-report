import school.*;
import util.*;
import java.util.*;
/**
 * 
 * @author Michael Sante
 * Tests the {@link Classroom} class.
 */
public class PrintReports {
	/**
	 * Classroom number.
	 */
	int room;
	/**
	 * Teacher's first name.
	 */
	String teacherFirst;
	/**
	 * Teacher's last name.
	 */
	String teacherLast;
	/**
	 * Subject taught by teacher.
	 */
	String teacherSubject;
	/**
	 * Student's first name.
	 */
	String studentFirst;
	/**
	 * Student's last name.
	 */
	String studentLast;
	/**
	 * Student ID number.
	 */
	int studentId;
	/**
	 * Student's final grade.
	 */
	int finalGrade;
	/**
	 * Instance of Teacher as Displayable object.
	 */
	Displayable newTeacher = null;
	/**
	 * Instances of Classroom in an array list collection.
	 */
	ArrayList<Displayable> classrooms = new ArrayList<Displayable>();
	
	public static void main(String[] args) {
		new PrintReports();
	}
	/**
	 * Used to create and display classroom information.
	 */
	public PrintReports() {
		
		char type;
		
		System.out.println("First You Need To Create A Classroom");
		
		do {
			Displayable classroom = enterClassroom();
			classrooms.add(classroom);
			type = KeyboardReader.getPromptedChar("Enter Another Classroom? (Y/N): ", "Enter either Y or N",
					new YesNoValidator());
		} while (type == 'y' || type == 'Y');
		
		report(classrooms);
	}
	/**
	 * Instantiates Classroom with user's input.
	 * @return A Classroom object as an instance of Displayable.
	 */
	public Displayable enterClassroom() {
		
		char type;
		/**
		 * Instances of Student in an array list collection.
		 */
		ArrayList<Displayable> students = new ArrayList<Displayable>();		
		
		room = KeyboardReader.getPromptedInt("Enter Room Number: ", "Classroom must be numeric", 
				new ClassroomValidator(), "Classroom number must be >= 100");
			
		System.out.println("Now You Need To Enter A Teacher For The Classroom");
		newTeacher = enterTeacher();
						
		System.out.println("Now You Need To Add Students For The Classroom");

		
		do {
			Displayable student = enterStudent();
			students.add(student);
			type = KeyboardReader.getPromptedChar("Enter Another Student? (Y/N): ", "Enter either Y or N",
					new YesNoValidator());
		} while (type == 'y' || type == 'Y');
		
		Displayable c = new Classroom(room, newTeacher, students);
		return c;
	} 

	/**
	 * Instantiates Teacher with user's input.
	 * @return A Teacher object as an instance of Displayable.
	 */
	public Displayable enterTeacher() {
		teacherFirst = KeyboardReader.getPromptedString("Enter Teacher First Name: ");
		teacherLast = KeyboardReader.getPromptedString("Enter Teacher Last Name: ");
		teacherSubject = KeyboardReader.getPromptedString("Enter Subject Taught: ");
		Displayable teacher = new Teacher(teacherFirst, teacherLast, teacherSubject);
		return teacher;
	}
	/**
	 * Instantiates Student with user's input.
	 * @return A Student object as an instance of Displayable.
	 */
	public Displayable enterStudent() {
		studentFirst = KeyboardReader.getPromptedString("Enter Student First Name: ");
		studentLast = KeyboardReader.getPromptedString("Enter Student Last Name: ");
		studentId = KeyboardReader.getPromptedInt("Enter Student ID: ", "Student ID must be numeric", 
				new StudentIdValidator(), "Student ID must be > 0");
		finalGrade = KeyboardReader.getPromptedInt("Enter Student Final Grade: ", "Final Grade must be numeric", 
				new FinalGradeValidator(), "Final Grade must be >= 0 and <= 100");
		Displayable s = new Student(studentFirst, studentLast, studentId, finalGrade);
		return s;
	}
	/**
	 * Displays all entered information using the overriding display() methods
	 * from the {@link Classroom}, {@link Teacher}, and {@link Student} classes.
	 * @param classrooms Array list collection of Classroom instances.
	 */
	void report(ArrayList<Displayable> classrooms) {
		System.out.println("------------------------------------------------------");
		for (Displayable classroom : classrooms) {
			System.out.println(classroom.display());
			System.out.println("------------------------------------------------------");
		}
	}
}

/**
 * 
 * @author Aaron D'Souza
 * @since 10/24/2022
 * Simple Course class that represents a working Course.
 * Contains all basic attributes relevant to a course taken
 * by someone
 *
 */
public class Course {
	private String courseName;
	private String description;
	private String department;
	private String time;     
	private String weekday;
	
	
	/**
	 * Fully loaded Course constructor
	 * @param courseName name of this Course
	 * @param description the description of this Course
	 * @param department the department of this Course
	 * @param time the 24hr meeting time of this Course
	 * @param weekday the weekday meet of this course
	 */
	public Course(String courseName, String description, String department, String time, String weekday) {
		super();
		this.courseName = courseName;
		this.description = description;
		this.department = department;
		this.time = time;
		this.weekday = weekday;
	}
	
	
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to be set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to be set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to be set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to be set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the weekday
	 */
	public String getWeekday() {
		return weekday;
	}
	/**
	 * @param weekday the weekday to be set
	 */
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	
	/**
	 * toString() override of Object to print out attributes of this course
	 */
	@Override
	public String toString() {
		return "CourseName= " + courseName + "\nDepartment= " + department + "\nDescription= " + description + "\nTime= "
				+ time + "\nWeekday= " + weekday + "\n";
	}
	
	
}

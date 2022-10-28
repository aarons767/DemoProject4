import java.util.*;

public class Student {

	private String firstName, lastName;
	private int age;
	private double gpa;
	private String major, department;
	private LinkedList<Course> course;

	
	/**
	 * Fully loaded Student constructor
	 * @param firstName the first name of this Student
	 * @param lastName the last name of this Student
	 * @param age the age of this Student
	 * @param gpa the gpa of this Student
	 * @param major major of this Student
	 * @param department department of this Student
	 * @param course the course of this Student
	 */
	public Student(String firstName, String lastName, int age, double gpa, String major, String department,
			LinkedList<Course> course) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.course = course;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to be set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to be set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to be set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}


	/**
	 * @param gpa the gpa to be set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}


	/**
	 * @param major the major to be set
	 */
	public void setMajor(String major) {
		this.major = major;
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
	 * @return the course
	 */
	public LinkedList<Course> getCourse() {
		return course;
	}


	/**
	 * @param course the course to be set
	 */
	public void setCourse(LinkedList<Course> course) {
		this.course = course;
	}
	
	/**
	 * Adds a new course to the list of Courses taken by
	 * this Student
	 * @param course the course to be added to this list of
	 * Courses taken by this Student
	 */
	public void addCourse(Course course) {
		if(!this.getCourse().contains(course))  //won't add repeats
			this.course.add(course);
		
	}
	
	/**
	 * Removes this course to the list of Courses taken by
	 * this Student
	 * @param course the course to be removed from this 
	 * list of Courses taken by this Student
	 */
	public void removeCourse(Course course) {
		if(this.getCourse().contains(course))  //to avoid exceptions
			this.course.remove(course);
	}
	
	/**
	 * Sorts courses in ascending or descending order and based on the
	 * attribute of a Student's Course's particular attribute.
	 * Valid input for an attribute are: "coursename", "description", "department",
	 * "time", "weekday". 
	 * Weekday inputs for Course must be in Titlecase.
	 * Method changes the original Course ordering. All attributes, except weekdays
	 * are sorted based on lexicographical order
	 * @param ascending whether or not to sort this Student's courses in 
	 * ascending or descending order. 
	 * Weekdays are case sensitive and are Title Cased
	 * @param attribute the attribute of this course upon which it will 
	 * be sorted
	 */
	public void sortCourses(boolean ascending, String attribute) {	

		LinkedHashMap<String, Integer> weekDayorder = new LinkedHashMap<String, Integer>();
		weekDayorder.put("Monday", 1);
		weekDayorder.put("Tuesday", 2);
		weekDayorder.put("Wednesday", 3);
		weekDayorder.put("Thursday", 4);
		weekDayorder.put("Friday", 5);
		weekDayorder.put("Saturday", 6);
		weekDayorder.put("Sunday", 7);
		
		//Would've used 10 comparators instead but using multiple if's 
		//for convenience
		Comparator<Course> lstComparator = new Comparator<Course>() {
			

			@Override
			public int compare(Course c1, Course c2) {
				if(ascending) {   //
					if(attribute.equalsIgnoreCase("coursename")) {
						return c1.getCourseName().compareToIgnoreCase(c2.getCourseName());  
					}
					else if(attribute.equalsIgnoreCase("description")) {
						return c1.getDescription().compareToIgnoreCase(c2.getDescription());  
	
					}
					else if(attribute.equalsIgnoreCase("department")) {
						return c1.getDepartment().compareToIgnoreCase(c2.getDepartment());  
					}
					else if(attribute.equalsIgnoreCase("time")) {
						return c1.getTime().compareToIgnoreCase(c2.getTime());  
					}
					else if(attribute.equalsIgnoreCase("weekday")) {
						try {
						return weekDayorder.get(c1.getWeekday()) - weekDayorder.get(c2.getWeekday());
						}
						catch(NullPointerException e) {
							System.out.println("Weekday not found\nCourse weekdays must be input in Titlecase\n");
						}
						//to compare weekday meeting order
					}
						return 0; //objects are equal by default
				}
				else {  //Descending order
					if(attribute.equalsIgnoreCase("coursename")) {
						return c2.getCourseName().compareToIgnoreCase(c1.getCourseName());  
					}
					else if(attribute.equalsIgnoreCase("description")) {
						return c2.getDescription().compareToIgnoreCase(c1.getDescription());  
	
					}
					else if(attribute.equalsIgnoreCase("department")) {
						return c2.getDepartment().compareToIgnoreCase(c1.getDepartment());  
					}
					else if(attribute.equalsIgnoreCase("time")) {
						return c2.getTime().compareToIgnoreCase(c1.getTime());  
					}
					else if(attribute.equalsIgnoreCase("weekday")) {
						try {
							return weekDayorder.get(c2.getWeekday()) - weekDayorder.get(c1.getWeekday());
							}
							catch(NullPointerException e) {
								System.out.println("Weekday not found\nCourse weekdays must be input in Titlecase\n");
							}
							//to compare weekday meeting order
					}
					return 0; //objects are equal by default
				}
			}

		};
		
	 course.sort(lstComparator);
	 
	 System.out.println("Sorted Student courses\n");
	 for(Course thisCourse : this.course) {
			System.out.println(thisCourse.toString());
	 }
		
	}
	
	/*
	public static void main(String args[]) {
		
		Course crse = new Course("Science", "Basic physics princles", "Physical science", "23:20", "Monday");
		Course crse2 = new Course("Math", "Integral calculus introduction", "Calculus", "22:20", "Friday");
		Course crse3 = new Course("History", "US Government History basics  class", "Arts", "1:20", "Tuesday");

		
		LinkedList<Course> coursesLIST= new LinkedList<Course>();
		coursesLIST.add(crse);
		coursesLIST.add(crse2);
		coursesLIST.add(crse3);
		
	

		Student stud = new Student("Aaron", "D'Souza", 40, 3.8, "CS" , "COMPUTER SCIENCE", coursesLIST);

		 for(Course thisCourse : stud.course) {
				System.out.println(thisCourse.toString());
		 }
		 
		 stud.sortCourses(true, "time");
	}
	*/


}

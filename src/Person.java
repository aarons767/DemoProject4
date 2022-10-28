
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	
	/**
	 * Fully loaded Person constructor
	 * @param firstName the first name of this Person
	 * @param lastName the last name of this Person
	 * @param age the age of this Person
	 */
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/**
	 * Default Person constructor sets all attributes
	 * to java defaults
	 */
	public Person() {
		this.firstName = "";
		this.age = 0;
		this.lastName = "";
	}
	

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @param firstName the firstName to be set for this Person
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
	 * @param lastName the lastName to be set for this Person
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
	 * @param age the age to be set for this Person
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/* 
	 * Override of Object to return the attributes of this Person
	 * in String format
	 */
	@Override
	public String toString() {
		return "FirstName= " + firstName + "\nLastName= " + lastName + "\nAge=" + age +"\n";
	}
	
	
}

import java.util.*;

/**
 * @author Aaron D'Souza
 * @since 10/24/2022
 * Tester class that performs tests on lists of
 * Persons
 */
public class PersonTest {
	
	public static void main(String args[]) {
	
		Person p1 = new Person("Joe", "Smith", 20);
		Person p2 = new Person("Amy", "Gold", 32);
		Person p3 = new Person("Tony", "Stork", 21);
		Person p4 = new Person("Sean", "Irish", 24);
		Person p5 = new Person("Tina", "Brock", 28);
		Person p6 = new Person("Lenny", "Hep", 18);
		
		//Contains a list of Person
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		
		//Creating custom comparators for each sorting preferences
		Comparator<Person> ageAscendComparator = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
					return p1.getAge() - p2.getAge();
			}
		};
		Comparator<Person> ageDescendComparator = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
					return p2.getAge() - p1.getAge();
			}
		};
		
		Comparator<Person> fnameAscendComparator = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				//Using lexicographical comparison
					return p1.getFirstName().compareTo(p2.getFirstName());
			}
		};
		
		Comparator<Person> fnameDescendComparator = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
					return p2.getFirstName().compareTo(p1.getFirstName());
			}
		};
		
		Comparator<Person> lnameAscendComparator = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				int result = p1.getLastName().length() - p2.getLastName().length();
					if( result != 0) {  
						return result;
					}
					else {
						//if lengths are the same, using lexicographical order for precision
						return p1.getLastName().compareTo(p2.getLastName());
					}
			}
		};
		
		Comparator<Person> lnameDescendComparator = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				int result = p2.getLastName().length() - p1.getLastName().length();
				if( result != 0) {  
					return result;
				}
				else {
					//if lengths are the same, using lexicographical order for precision
					return p2.getLastName().compareTo(p1.getLastName());
				}			
			}
		};
		
		System.out.println("Original list data:");
		for(Person current : people) {
			System.out.println(current.toString());
		}
		
		System.out.println("Sorted by age, ascending order:");
		Collections.sort(people, ageAscendComparator);
		for(Person current : people) {
			System.out.println(current.toString());
		}
		
		System.out.println("Sorted by age, descending order:");
		Collections.sort(people, ageDescendComparator);
		for(Person current : people) {
			System.out.println(current.toString());
		}
		
		System.out.println("Sorted by First name, ascending order:");
		Collections.sort(people, fnameAscendComparator);
		for(Person current : people) {
			System.out.println(current.toString());
		}
				
		System.out.println("Sorted by First name, descending order:");
		Collections.sort(people, fnameDescendComparator);
		for(Person current : people) {
			System.out.println(current.toString());
		}
		
		System.out.println("Sorted by Last name, ascending order:");
		Collections.sort(people, lnameAscendComparator);
		for(Person current : people) {
			System.out.println(current.toString());
		}
		
		System.out.println("Sorted by Last name, descending order:");
		Collections.sort(people, lnameDescendComparator);
		for(Person current : people) {
			System.out.println(current.toString());
		}
		
		
	}
	
	
	
	
}

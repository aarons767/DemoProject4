import java.util.*;

/**
 * 
 * @author Aaron D'Souza
 * @since 10/21/2022
 * Simple class that helps manipulate ArrayList
 * data structures such as sorting and basic swapping of
 * integers
 *
 */
public class ListManipulator {
	
	/*
	public static void main(String args[]) {
		
		ArrayList<Integer> tester = new ArrayList<Integer>();
		tester.add(5);
		tester.add(-1);
		tester.add(3);
		tester.add(3);
		tester.add(90);
		tester.add(90);
		tester.add(-1);
		tester.add(3);
		tester.add(9);
		
		for(Integer current : tester) {
			System.out.println(current);
		}
		System.out.println("\n");

		table(tester); //change methods to static for testing purposes...
		System.out.println("\n");

		for(Integer current : tester) {
			System.out.println(current);
		}
	}
	*/
	
	
	/**
	 * Accepts an array list of integers and sorts it in ascending or descending order. 
	 * Method returns the sorted list
	 * @param myLst the input array list to be sorted
	 * @param ascending boolean whether or not this is to be sorted in ascending or discending order
	 * @return a modified array list with the preferred sorting order
	 */
	public ArrayList<Integer> sort(ArrayList<Integer> myLst, boolean ascending)
	{
		
		Comparator<Integer> ascendingComparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer int1, Integer int2) {
					return int1 - int2;
			}
		};
		
		Comparator<Integer> descendingComparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer int1, Integer int2) {
					return int2 - int1;
			}
		};
		
		if(ascending) {
			myLst.sort(ascendingComparator);
		}
		else {
			myLst.sort(descendingComparator);
		}
		
		return myLst;
				
	}


	/**
	 * Accept an array list of integers and swamps positions of largest and smallest 
	 * elements- method modifies the original list 
	 * @param myLst the inputed array list to be manipulated
	 * @return a modified myLst where the largest and smallest element positions are swapped
	 */
	public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst){
		
		Integer largest = new Integer(-99999999);
		Integer smallest = new Integer(999999999);
		
		for(int i =0; i < myLst.size(); i++) {
			
			for(int j = 0; j < i; j++) {
				
				if(myLst.get(j) > largest) {
					largest = myLst.get(j);
				}
				if(myLst.get(j) < smallest) {
					smallest = myLst.get(j);
				}
			}
		}
		
		int temp= largest;
		int firstIndex =  myLst.indexOf(smallest);
		myLst.set(myLst.indexOf(largest), smallest);
		myLst.set(firstIndex, temp);
		
		
		return myLst;
	}
	
	/**
	 * Accepts an array list of integers and creates a table of
	 * values(no repeats) and the number of occurrences for each value.
	 * Values-key sets are then sorted by keys and printed to command line
	 * @param myLst the array list that needs to be scanned for values and
	 * number of occurrences(key-value set)
	 */
	public void table(ArrayList<Integer> myLst) {
		TreeMap<Integer, Integer> valueTable =  new TreeMap<Integer, Integer>();
		//Tree Map so don't have to worry about sorting
		
		for(Integer thisInt : myLst) {
			if(valueTable.containsKey(thisInt)) {
				Integer value = valueTable.get(thisInt);
					valueTable.put(thisInt, value+1);				
			}
			else {    //no such key yet...
				valueTable.put(thisInt, 1);
			}
		}
		
		Set dict = valueTable.entrySet();
		Iterator valuesIterator = dict.iterator();
		while(valuesIterator.hasNext()) {
			Map.Entry valuesEntry = (Map.Entry) valuesIterator.next();
			
			System.out.println(valuesEntry.getKey() + " : "+ valuesEntry.getValue() + " time(s)");
		}
		
		
		
	}
	
	
	
	
	
}

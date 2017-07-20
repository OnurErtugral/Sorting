import java.io.ObjectInputStream.GetField;


public class InsertionSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InsertionSort test = new InsertionSort(10);
		InsertionSort test2 = new InsertionSort(10);
		test2.clone(test);
		
		System.out.println(test.toString());
		
		test.insertionSort();
		System.out.println("After insertion sort:  " + test);
		
		System.out.println(test2);
		test2.insertionSort2();
		System.out.println("After insertion Sort2: " + test2);
		
		
		System.out.println("Number of swap: " + test.getCount());
		System.out.println("Number of swap: " + test2.getCount());
		
	}

}

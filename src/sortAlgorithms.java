
/**
 * @author Laila Alhalabi
 * A program that tests five popular sorting algorithms (insertion, selection, heap, merge and quick sort).
 */
public class sortAlgorithms {
	
	public static void main(String[] args) {
		
		System.out.println("     Sorting algorithms Tester      ");
		System.out.println("----------------------------------\n");
		ArrayToSort array = new ArrayToSort();
		
		int[] array1 = {13, 11, 4, 40, 7, 34, 25, 17, 50, 17, 14};
		System.out.println("Testing insertion sort algorithm:\n");
		System.out.println("Insertion sort works by:\n"
				+ "\t1. Peeking a key and comparing it with the keys ahead of it.\n"
				+ "\t2. Repeating comparing till reaching the end.\n");
		array.insertionSort(array1);
		System.out.println("----------------------------------\n");
		
		
		int[] array2 = {13, 11, 4, 40, 7, 34, 25, 17, 50, 17, 14};
		System.out.println("Testing selection sort algorithm:\n");
		System.out.println("Selection sort works by:\n"
				+ "\t1. Searching for the smallest value and inserting it first.\n"
				+ "\t2. Discarding the smallest value and reapeating the same thing for the rest of the values and so on.\n");
		array.selectionSort(array2);
		System.out.println("----------------------------------\n");
		
		
		int[] array3 = {13, 11, 4, 40, 7, 34, 25, 17, 50, 17, 14};
		System.out.println("Testing heap sort algorithm:\n");
		System.out.println("Heap sort works by:\n"
				+ "\t1. Represent the array as a binary tree & build a heap.\n"
				+ "\t2. The max element will be at the root (n-1).\n"
				+ "\t3. The max element will be removed from the heap and the size will be reduced by 1.\n"
				+ "\t4. A heapify() method was created to adjust the nodes of the heap.\n");
		array.heapSort(array3);
		System.out.println("----------------------------------\n");	
		
		
		int[] array4 = {13, 11, 4, 40, 7, 34, 25, 17, 50, 17, 14};
		System.out.println("Testing merge sort algorithm: \n");
		System.out.println("Merge sort works by:\n"
				+ "\t1. Dividing the array into two parts.\n"
				+ "\t2. Sorting the two parts divided.\n"
				+ "\t3. Merging the two parts.\n");
		array.mergeSort(array4, 11);
		System.out.println("----------------------------------\n");	
		
		
		int[] array5 = {13, 11, 4, 40, 7, 34, 25, 17, 50, 17, 14};
		System.out.println("Testing quick sort algorithm: \n");
		System.out.println("Quick sort works by:\n"
				+ "\t1. Picking the last element x as a pivot.\n"
				+ "\t2. Dividing the array to L (elements > x ), S (elements < x), R (elements = x).\n"
				+ "\t3. Sorting the partitions and merging.\n");
		array.quickSort(array5, 0, 10);
		System.out.println("----------------------------------\n");	
		
	}
}

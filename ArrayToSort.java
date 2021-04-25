
public class ArrayToSort {
	
    void insertionSort(int[] array) {
		for (int a = 0; a < array.length - 1; a++) {
			int current = array[a];
			int b = a - 1;
			while (b > -1 && array[b] > current) {
				array[b + 1] = array[b];
				b--;
			}
			array[b + 1] = current;
			print(array);
		}
	}	
	
	void selectionSort(int[] array) {
		for (int a = 0; a < array.length - 1; a++) {
			int current = a;
			for (int b = a + 1; b < array.length; b++) {
				if (array[b] < array[current]) {
					current = b;// searching for lowest index
				}
			}
			int smaller = array[current];
			array[current] = array[a];
			array[a] = smaller;
			print(array);
		}
	}
	
	void heapSort(int[] array) {
		for (int i = array.length / 2 - 1; i >= 0; i--) // Building the heap 
			heapify(array, array.length, i);
		for (int i = array.length - 1; i >= 0; i--) {
			print(array);
			// Moving the current root to the end
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			heapify(array, i, 0);
		}
	}
	
	private void heapify(int[] array, int length, int i) {
		int largest = i; 
		int left = 2 * i + 1; 
		int right = 2 * i + 2; 
		if (left < length && array[left] > array[largest])
			largest = left;
		if (right < length && array[right] > array[largest])
			largest = right;
		if (largest != i) { // If the largest number is not at the root
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;
			heapify(array, length, largest);
		}
	}
	
	void mergeSort(int arr[], int n) {
        int curr_size;       
        int left_start;
        for (curr_size = 1; curr_size <= n-1; curr_size = 2*curr_size) {
            for (left_start = 0; left_start < n-1; left_start += 2*curr_size) {
                int mid = Math.min(left_start + curr_size - 1, n-1);
                int right_end = Math.min(left_start + 2*curr_size - 1, n-1);
                merge(arr, left_start, mid, right_end);
            }
        }
    }
     
    /* Function to merge the two haves arr[l..m] and arr[m+1..r] of array arr[] */
    void merge(int arr[], int l, int m, int r) {
    	print(arr);
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
		for (i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (j = 0; j < n2; j++)
			R[j] = arr[m + 1 + j];
        i = 0; j = 0; k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
    
    void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    int partition(int arr[], int left, int right) {
        int pivot = arr[right];
        int high = right;
        while(left < high){
            while(left < high && arr[left] < pivot){
                left++;
            }
            while(left < high && arr[high] >= pivot){
                high--;
            }
            swap(arr,left, high);
        }
        swap(arr, left, right);
        return left;
    }

    void quickSort(int arr[], int left, int right) {
    	print(arr);
        if( left < right) {
            int index = partition(arr, left, right);
            quickSort(arr, left, index - 1);
            quickSort(arr, index+1, right);
        }
    }
    
	void print(int array[]) {
		for (int p = 0; p < array.length; p++)
			System.out.print(array[p] + " ");
		System.out.println();
	}
}

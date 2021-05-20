package ds.quicksort;

import java.util.Random;

public class QuickSort extends AbstractSort {
	
	public static void sort(IPAddress[] elements) {
		shuffle(elements);
		sort(elements, 0, elements.length - 1);
	}
	
	private static void shuffle(IPAddress[] elements) {
		Random rand = new Random();	
		for (int i = 0; i < elements.length; i++) {	
			int r = i + rand.nextInt(elements.length - i);
			swap(elements, i, r);
		}
	}
	
	private static void sort(IPAddress[] elements, int low, int high) {
		if (high <= low) {
			return;
		}
		int j = partition(elements, low, high);	
		sort(elements, low, j - 1);
		sort(elements, j + 1, high);
	}
	
	private static int partition(IPAddress[] elements, int low, int high) {
		int i = low;
		int j = high + 1;
		while (true) {
			while (less(elements[++i], elements[low])) {
				if (i == high) {
					break;
				}
			}
			while (less(elements[low], elements[--j])) {
				if (j == low) {
					break;
				}
			}
			if (i >= j) {
				break;
			}
			swap(elements, i, j);
		}
		swap(elements, low, j);	
		return j;
	}
}


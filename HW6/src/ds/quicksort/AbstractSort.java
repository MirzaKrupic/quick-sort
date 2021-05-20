package ds.quicksort;

public class AbstractSort {

	public static boolean less(IPAddress v, IPAddress w) {
		if(v.compareTo(w) == 1) return false;
		return true;
	}
	
	public static void swap (IPAddress[] elements, int a, int b) {
		IPAddress tmp = elements[a];
		elements[a] = elements[b];
		elements[b] = tmp;
	}

}

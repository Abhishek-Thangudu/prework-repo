public class RotateSortedArray {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {
        return binarySearch(a, 0, a.size() -1, b);
	}
	private  int binarySearch(List<Integer> a, int l, int h, int key)
    {
        if (l > h) 
            return -1;
       
        int mid = (l+h)/2;
        if (a.get(mid) == key)
            return mid;
        if (a.get(l) <= a.get(mid))
        {
            if (key >= a.get(l) && key <= a.get(mid))
               return binarySearch(a, l, mid-1, key);
       
            return binarySearch(a, mid+1, h, key);
        }
        if (key >= a.get(mid) && key <= a.get(h))
            return binarySearch(a, mid+1, h, key);
       
        return binarySearch(a, l, mid-1, key);
    }
}
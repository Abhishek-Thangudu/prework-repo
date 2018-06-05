public class InsertSorted {
	public int searchInsert(ArrayList<Integer> a, int b) {
	    int i = 0; 
	    int j = a.size() -1;
	    while(i < j){
	        int mid = (j + i) / 2;
	        if(b == a.get(mid)){
	            return mid;
	        }else if(b > a.get(mid)){
	            i = mid + 1;
	        }else {
	            j = mid;
	        }
	    }
	    return i + 1;
	}
}
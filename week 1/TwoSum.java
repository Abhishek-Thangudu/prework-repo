public class TwoSum {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] twoSum(final int[] A, int B) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            if(map.containsKey(A[i])){
                int result[] = new int[2];
                result[0] = map.get(A[i]);
                result[1] = i + 1;
                return result;
            }else if(!map.containsKey(B - A[i])){
                map.put(B - A[i], i+1);
            }
        }
        return new int[0];
    }
}
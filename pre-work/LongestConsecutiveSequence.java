public class LongestConsecutiveSequence {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            set.add(A[i]);
        }
        int max = 0;
        for(Integer num : set){
            if(!set.contains(num - 1)){
                int curr = num;
                int size = 1;
                while(set.contains(curr+1)){
                    ++curr;
                    ++size;
                }
                max = Math.max(max,size);
            }
        }
        return max;
    }
}
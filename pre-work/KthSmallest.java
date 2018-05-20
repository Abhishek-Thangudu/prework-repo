public class KthSmallest {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }

        });
        int index = 0;
        while(index < A.length && index < B){
            queue.add(A[index++]);
        }
        for(index = B; index < A.length; index++){
            if(A[index] < queue.peek()){
                queue.remove();
                queue.add(A[index]);
            }
        }
        return queue.remove();
    }
}
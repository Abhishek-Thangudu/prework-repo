public class MaxNonNegativeSubArray {
    public int[] maxset(int[] A) {
        
        boolean counting = false;
        int count = 0;
        int endIndex = -1;
        int maxCount = 0;
        long max = -1;
        long sum = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] >= 0){
                counting = true;
                sum += (long) A[i]; 
                count++;
            }else {
                if(counting){
                    counting = false;
                    if((sum > max) || (sum == max && count > maxCount)){
                        max = sum;
                        maxCount = count;
                        endIndex = i - 1;
                        
                    }
                    sum = 0;
                    count = 0;
                }
            }
        }
        if(counting){
            if((sum > max) || (sum == max && count > maxCount)){
                max = sum;
                maxCount = count;
                endIndex = A.length - 1;
                sum = 0;
                count = 0;
            }
        }
        int result[] = new int[maxCount];
        for(int i = maxCount - 1; i >=0; i--){
            result[i] = A[endIndex--];
        }
        return result;
    }
}

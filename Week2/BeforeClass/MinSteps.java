public class MinSteps {
    public int coverPoints(int[] A, int[] B) {
        
        int sum = 0;
        
        for(int i = 1; i < A.length; i++){
            int diffI = Math.abs(A[i] - A[i-1]);
            int diffJ = Math.abs(B[i] - B[i - 1]);
            sum += Math.max(diffI, diffJ);
        }
        return sum;
    }
}
public class NextGreater {
    public int[] nextGreater(int[] A) {
        int greater[] = new int[A.length];
        if(A.length == 0)
            return greater;
        greater[A.length - 1] = -1;
        int max = A[A.length - 1];
        for(int i = A.length - 2; i >= 0; i--){
            if(A[i] >= max){
                max = A[i];
                greater[i] = -1;
            } else {
                for(int j = i + 1; j < A.length; j++){
                    if(A[j] > A[i]){
                        greater[i] = A[j];
                        break;
                    }
                }
            }
        }
        return greater;
    }
}
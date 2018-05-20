public class PrettyPrint {
    public int[][] prettyPrint(int A) {
        int result[][] = new int[2*A - 1][2*A - 1];
        int start = -1;
        int end = 2 * A - 1;
        while(A > 0){
            start = start + 1;
            end = end - 1;
            for(int i = start; i <= end; i++){
                result[start][i] = A;
                result[end][i] = A;
                result[i][start] = A;
                result[i][end] = A;
            }
            --A;
        }
        return result;
    }
}
public class LongestSubsequenceLength {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestSubsequenceLength(final List<Integer> A) {
        if(A == null || A.size() == 0)
            return 0;
        int i, j;
        int n = A.size();
        int[] lis = new int[A.size()];
        for (i = 0; i < n; i++)
            lis[i] = 1;
 
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (A.get(i) > A.get(j) && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
 
        int[] lds = new int [A.size()];
        for (i = 0; i < n; i++)
            lds[i] = 1;
 
        for (i = n-2; i >= 0; i--)
            for (j = n-1; j > i; j--)
                if (A.get(i) > A.get(j) && lds[i] < lds[j] + 1)
                    lds[i] = lds[j] + 1;
 
        int max = lis[0] + lds[0] - 1;
        for (i = 1; i < n; i++)
            if (lis[i] + lds[i] - 1 > max)
                max = lis[i] + lds[i] - 1;
 
        return max;
    }
}

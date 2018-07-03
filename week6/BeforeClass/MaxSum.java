public class MaxSum {
    public int adjacent(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> row1 = A.get(0);
        ArrayList<Integer> row2 = A.get(1);
        
        if(row1.size() == 0)
            return 0;
        int inclusion = Math.max(row1.get(0), row2.get(0));
        int exclusion  = 0;
        
        for(int i = 1; i < row1.size(); i++){
            int temp = inclusion;
            inclusion = exclusion + Math.max(row1.get(i), row2.get(i));
            exclusion = temp;
        }
        return Math.max(inclusion, exclusion);
    }
}
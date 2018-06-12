public class Combinations {
    
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> combine(int A, int B) {
        boolean[] c = new boolean[A+1];
        combination(c,A,B);
        return result;
    }
    
    private void combination(boolean[] c, int n , int k){
        if(k > n){
            return;
        }
        else if(k == 0){
            visit(c);
        }
        else {
            // considering n
            c[c.length - n] = true;
            combination(c, n - 1, k - 1);
            c[c.length - n] = false; // clean up
            // without considering n
            combination(c, n - 1, k);
        }
    }
    
    private void visit(boolean[] c){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < c.length; i++){
            if(c[i]){
                list.add(i);
            }
        }
        result.add(list);
    }
}

public class EqualSum {
    static class Node{
        int a1;
        int a2;
        Node(int a1, int a2){
            this.a1 = a1;
            this.a2 = a2;
        }
    }
    public int[] equal(int[] A) {
        if(A.length < 3)
            return new int[0];
        int result[] = new int[4];
        result[0] = Integer.MAX_VALUE;
        result[1] = Integer.MAX_VALUE;
        result[2] = Integer.MAX_VALUE;
        result[3] = Integer.MAX_VALUE;
        HashMap<Integer, Solution.Node> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            for(int j = i + 1; j < A.length; j++){
                int sum = A[i] + A[j];
                if(map.containsKey(sum)){
                    Solution.Node node = map.get(sum);
                    if(node.a1 != i && node.a2 != i && node.a2 != i && node.a2 != j && (result[0] > node.a1 || (result[0] == node.a1 && result[1] > node.a2) || 
                        (result[0] == node.a1 && result[1] == node.a2 && result[2] > i) || 
                        (result[0] == node.a1 && result[1] == node.a2 && result[2] == i && result[3] > j))){
                    result[0] = node.a1;
                    result[1] = node.a2;
                    result[2] = i;
                    result[3] = j;
                        }
                }else {
                    map.put(sum, new Solution.Node(i,j));
                }
            }
        }
        if(result[0] != Integer.MAX_VALUE)
            return result;
        return new int[0];
    }
}
public class SequenceWithPrimes {
    public ArrayList<Integer> solve(int A, int B, int C, int D) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int num = Math.min(A,B);
        num = Math.min(num,C);
        int count  = 0;
        while(count < D){
            int temp = num;
            while(num % A == 0){
                num = num / A;
            }
            while(num % B == 0){
                num = num / B;
            }
            while(num % C == 0){
                num = num / C;
            }
            if(num == 1){
                result.add(temp);
                count++;
            }
            num = temp + 1;
        }
        return result;
    }
}

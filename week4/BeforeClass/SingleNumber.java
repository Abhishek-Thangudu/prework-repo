public class SingleNumber {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int num = 0;
        for(Integer n : A){
            num = num ^ n;
        }
        return num;
    }
}
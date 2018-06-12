public class CountOnes {
    public int numSetBits(long a) {
        int num = 1;
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((a & num) != 0)
                count++;
            num = num << 1;
        }
        return count;
    }   
}
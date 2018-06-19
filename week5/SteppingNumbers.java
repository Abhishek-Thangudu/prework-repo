public class SteppingNumbers {
    public ArrayList<Integer> stepnum(int A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = A; i <= B; i++){
            int temp = i;
            boolean b = true;
            int digit = temp % 10;
            temp = temp / 10;
            while(temp > 0){
                int tempDigit = temp % 10;
                if(Math.abs(tempDigit - digit) != 1){
                    b = false;
                    break;
                }
                digit = tempDigit;
                temp = temp / 10;
            }
            if(b){
                result.add(i);
            }
        }
        
        return result;
    }
}

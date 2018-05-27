public class LongestSubstringLength {
    public int lengthOfLongestSubstring(String A) {
        if(A == null || A.length() == 0)
            return 0;
        int arr[] = new int[A.length()];
        int max = 0;
        int count = 1;
        int start = 1;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put(A.charAt(0),1);
        for(int i = 1; i < A.length(); i++){
            char c = A.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,i+1);
                count++;
            }else {
                int num = map.get(c);
                if(num < start){
                    count++;
                }else {
                    if(count > max){
                        max = count;
                    }
                    count = i - num + 1;
                    start = num + 1;
                }
                map.put(c, i+1);
            }
        }
        return (max > count ? max : count);
    }
}

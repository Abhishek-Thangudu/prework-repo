public class CountAndSay {
    public String countAndSay(int A) {
        if(A == 1)
            return "1";
        if(A == 2)
            return "11";
        String str = "11";
        A = A-2;
        while(A > 0){
            char prevChar = str.charAt(0);
            int count = 1;
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < str.length(); i++){
                if(str.charAt(i) == prevChar){
                    count++;
                }else {
                    sb.append(count);
                    sb.append(prevChar);
                    prevChar = str.charAt(i);
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(prevChar);
            A--;
            str = sb.toString();
        }
        return str;
    }
}
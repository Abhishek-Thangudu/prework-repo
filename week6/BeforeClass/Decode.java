public class Decode {
    public int numDecodings(String A) {
        return generate(A,0);
    }
    
    public int generate(String s,int i){
        if(i==s.length()){
            return 1;
        }
        if(i>s.length()){
            return 0;
        }
        String one = s.substring(i,i+1);
        if(one.equals("0"))return 0;
        int sum= generate(s,i+1);
        
        if(i<s.length()-1){
            String two = s.substring(i,i+2);
            
            int val = Integer.parseInt(two);
            //for 0 and values over 26
            if(val<=26){
                sum+= generate(s,i+2);
            }
        }
        return sum;
    }
}
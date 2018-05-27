public class ReverseWords {
	public String reverseWords(String a) {
	    if(a == null || a.length() == 0)
	    return "";
	    String[] str = a.split(" ");
	    StringBuilder sb = new StringBuilder();
	    sb.append(str[str.length - 1]);
	    for(int i = str.length - 2; i >= 0 ; i--){
	        sb.append(" ");
	        sb.append(str[i]);
	    }
	    return sb.toString();
	}
}
public class PointsOnStraightLine {
	public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
       if (a==null) return 0;
        	if (a.size()<=2) return a.size();
        	
        	Map<Integer,Map<Integer,Integer>> map = new HashMap<Integer,Map<Integer,Integer>>();
        	int result=0;
        	for (int i=0;i<a.size();i++){ 
        		map.clear();
        		int overlap=0,max=0;
        		for (int j=i+1;j<a.size();j++){
        			int x=a.get(j)-a.get(i);
        			int y=b.get(j)-b.get(i);
        			if (x==0&&y==0){
        				overlap++;
        				continue;
        			}
        			int gcd=generateGCD(x,y);
        			if (gcd!=0){
        				x/=gcd;
        				y/=gcd;
        			}
        			
        			if (map.containsKey(x)){
        				if (map.get(x).containsKey(y)){
        					map.get(x).put(y, map.get(x).get(y)+1);
        				}else{
        					map.get(x).put(y, 1);
        				}   					
        			}else{
        				Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        				m.put(y, 1);
        				map.put(x, m);
        			}
        			max=Math.max(max, map.get(x).get(y));
        		}
        		result=Math.max(result, max+overlap+1);
        	}
        	return result;
	}
	       private int generateGCD(int a,int b){
    
        	if (b==0) return a;
        	else return generateGCD(b,a%b);
        	
        }
}

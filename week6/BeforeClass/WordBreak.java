public class WordBreak {
    static class Node {
        int start;
        int end;
        Node(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public int wordBreak(String A, ArrayList<String> B) {
        
        ArrayList<Node> list = new ArrayList<>();
        
        for(String s : B){
            int start = A.indexOf(s);
            while(start != -1){
                int end = start + s.length();
                Node n = new Node(start, end);
                list.add(n);
                start = A.indexOf(s, start + 1);
            }
        }
        
        if(list.size() == 0)
            return 0;
        Collections.sort(list, new Comparator<Node>(){
            
            public int compare(Node n1, Node n2){
                return n1.start - n2.start;
            }
            
        });
        
        boolean arr[] = new boolean[A.length() + 1];
        Node node = list.get(0);
        if(node.start != 0)
            return 0;
            
        arr[0] = true;
        for(Node n : list){
            if(arr[n.start])
                arr[n.end] = true;
        }
        
        if(arr[A.length()]){
            return 1;
        }else {
            return 0;
        }
    }
}

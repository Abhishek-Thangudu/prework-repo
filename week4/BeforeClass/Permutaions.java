public class Permutaions {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> list) {
        Collections.sort(list);
        visit(list);
        while (true) {
            int j = findJ(list);
            if (j == -1)
                break;
            int l = findL(list, j);
            swap(list, j, l);
            reverse(list, j + 1);
            visit(list);
        }
        return result;
    }

    private int findJ(ArrayList<Integer> list) {
        int j = -1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                j = i - 1;
            }
        }
        return j;
    }

    private int findL(ArrayList<Integer> list, int j) {
        int l = j + 1;
        for (int i = j + 2; i < list.size(); i++) {
            if (list.get(i) > list.get(j)) {
                l = i;
            }
        }
        return l;
    }

    private void swap(ArrayList<Integer> list, int j, int l) {
        int temp = list.get(j);
        list.set(j, list.get(l));
        list.set(l, temp);
    }

    private void reverse(ArrayList<Integer> list, int j) {
        int l = list.size() - 1;
        while (l > j) {
            swap(list, j, l);
            j++;
            l--;
        }
    }

    private void visit(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer num : list) {
            temp.add(num);
        }
        result.add(temp);
    }
}

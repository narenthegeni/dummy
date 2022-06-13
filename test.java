public class Solution {
	public ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> a) {

		int row = a.size();

		int totalLayer = row > 2 ? row - 2 : row;
		int m = 0, n = 0, prev = 0; // 0 - Right, 1 - Down, 2 - Left, 3 - Up
		for (int loop = 0; loop < totalLayer; loop++) {
			int layer = row - 1 - loop;
			int limitLayer = layer - m;
			for (int i = 0; i < limitLayer; i++) {

				int cur = a.get(m).get(n + i);
				prev = a.get(m + i).get(layer);
				a.get(m + i).set(layer, cur);
				cur = prev;

				prev = a.get(layer).get(layer - i);
				a.get(layer).set(layer - i, cur);
				cur = prev;

				prev = a.get(layer - i).get(n);
				a.get(layer - i).set(n, cur);
				cur = prev;

				a.get(m).set(n + i, cur);
			}
			m++;
			n++;
		}

		return a;
	}
}

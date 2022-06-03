
import java.util.List;

public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int repeatedNumber(final List<Integer> A) {

		int [] store = new int[A.size()];
//		System.out.println("Array size" + A.size());
		for (int i = 0; i < A.size(); i++) {
			if (store[A.get(i)] == A.get(i)) {
				return A.get(i);
			} else {
				store[A.get(i)] = A.get(i);
			}
		}
		return 1;
	}
}

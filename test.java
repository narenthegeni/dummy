import java.util.List;

public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int repeatedNumber(final List<Integer> A) {

		for (int i = 0; i < A.size(); i++) {
			for (int j = i + 1; j < A.size(); j++) {
				int left = A.get(i);
				int right = A.get(j);
				if (left == right) {
;					return right;
				}
			}
		}
		return 1;
	}
}

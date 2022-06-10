public class Solution {
	public ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> a) {

		int row = a.size();
		int col = a.get(0).size();
		
		int totalLayer = row > 2 ? row - 2 : row;
		int direction = 0, m = 0, n = 0, prev = 0, nPointer = -1, mPointer = -1; // 0 - Right, 1 - Down, 2 - Left, 3 - Up
		for (int loop = 1; loop <= totalLayer; loop++) {
			for (int rowRotate = 1; rowRotate <= row - (nPointer + 2); rowRotate++) {
				int cur = a.get(m).get(n);
				for (int i = 0; i <= ((row - (nPointer + 1))* 4) - 4; i++) {

					if (row <= 1) {
						break;
					}
					switch (direction) {

					// Right
					case 0:
						n++;
						if (n >= col) {
							direction++;
							n--;
						} else {
							prev = a.get(m).get(n);
							a.get(m).set(n, cur);
							cur = prev;
							break;
						}

						// Down
					case 1:
						m++;
						if (m >= row) {
							direction++;
							m--;
						} else {
							prev = a.get(m).get(n);
							a.get(m).set(n, cur);
							cur = prev;
							break;
						}

						// Left
					case 2:
						n--;
						if (n <= nPointer) {
							direction++;
							n++;
						} else {
							prev = a.get(m).get(n);
							a.get(m).set(n, cur);
							cur = prev;
							break;
						}

						// Up
					case 3:
						m--;
						if (m <= mPointer) {
							direction = 0;
							m++;
						} else {
							prev = a.get(m).get(n);
							a.get(m).set(n, cur);
							cur = prev;
							break;
						}

					default:
						break;

					}
				}
			}
			row --;
			col --;
			m++;
			n++;
			mPointer++;
			nPointer++;
		}

		return a;
	}
}

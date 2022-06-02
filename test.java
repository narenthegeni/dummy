package com.test.hib.HibernateTestApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Train {

	public static void main(String[] args) {

		Train train = new Train();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(6);
		arrayList1.add(7);
		arrayList1.add(8);
		arrayList1.add(9);
		arrayList1.add(10);
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(11);
		arrayList2.add(12);
		arrayList2.add(13);
		arrayList2.add(14);
		arrayList2.add(15);
		ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
		arrayList3.add(16);
		arrayList3.add(17);
		arrayList3.add(18);
		arrayList3.add(19);
		arrayList3.add(20);
		ArrayList<Integer> arrayList4 = new ArrayList<Integer>();
		arrayList4.add(21);
		arrayList4.add(22);
		arrayList4.add(23);
		arrayList4.add(24);
		arrayList4.add(25);

		List<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		input.add(arrayList);
		input.add(arrayList1);
		input.add(arrayList2);
		input.add(arrayList3);
		input.add(arrayList4);
		ArrayList<Integer> spiralOrder = train.spiralOrder(input);

		System.out.println(Arrays.toString(spiralOrder.toArray()));
	}

	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {

		ArrayList<Integer> spiralResult = new ArrayList<Integer>();
		int row = A.size();
		int col = A.get(0).size();
		int totalSize = row * col;
		int endRight = col - 1;
		int endDown = row - 1;
		int endLeft = 0;
		int endUp = 0;

		while (totalSize > spiralResult.size()) {

			// RIGHT
			for (int i = endLeft; i <= endRight; i++) {
				spiralResult.add(A.get(endLeft).get(i));
			}
			if (totalSize == spiralResult.size()) {
				break;
			}
			// DOWN
			for (int i = endUp+1; i <= endDown; i++) {
				spiralResult.add(A.get(i).get(endRight));
			}
			if (totalSize == spiralResult.size()) {
				break;
			}
			// LEFT
			for (int i = endRight-1; i >= endLeft; i--) {
				spiralResult.add(A.get(endDown).get(i));
			}
			if (totalSize == spiralResult.size()) {
				break;
			}
			// UP
			for (int i = endDown-1; i > endUp; i--) {
				spiralResult.add(A.get(i).get(endUp));
			}

			endRight--;
			endDown--;
			endLeft++;
			endUp++;
		}
		return spiralResult;
	}
}

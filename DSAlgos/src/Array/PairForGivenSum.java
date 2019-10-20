package Array;

import java.util.*;

public class PairForGivenSum {

	// Method-1

	static void FindingPairforgivenSum(int[] ipArray, int Sum) {

		for (int i = 0; i < ipArray.length; i++) {
			for (int j = i + 1; j < ipArray.length; j++) {

				if (ipArray[i] + ipArray[j] == Sum) {

					System.out.println("pair for given sum found at indexes : " + i + " " + j);
					break;
				}
			}
		}
	}

	// Method-2

	static void FindingPairforgivenSum1(int[] InputArray, int Sum) {

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int count = 0;

		for (int i = 0; i < InputArray.length; i++) {

			int val = Sum - InputArray[i];

			if (hm.containsKey(val)) {

				int n = hm.get(val);
				System.out.println("pair found at indexes " + n + " and " + i);

			}

			hm.put(InputArray[i], i);

		}

	}

	public static void main(String[] args) {

		int[] InputArray = { 1, 2, 8, 9, 5 };
		int Sum = 10;
		FindingPairforgivenSum(InputArray, Sum);
		FindingPairforgivenSum1(InputArray, Sum);

	}

}

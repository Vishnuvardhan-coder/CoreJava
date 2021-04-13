package com.trinetra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KthMaxFrequentElement {

	private static List<Integer> kmostFrequent(int[] nums, int k) {

		Map<Integer, Integer> countMap = new HashMap<>();
		int maxFreq = 0;

		for (int i = 0; i < nums.length; i++) {

			int freq = countMap.getOrDefault(nums[i], 0) + 1;

			countMap.put(nums[i], freq);

			maxFreq = Math.max(maxFreq, freq);
		}

		List<Integer>[] bucket = new List[maxFreq + 1];

		for (int n : countMap.keySet()) {
			int freq = countMap.get(n);

			if (bucket[freq] == null)
				bucket[freq] = new ArrayList<>();

			bucket[freq].add(n);
		}

		List<Integer> res = new ArrayList<>();
		for (int i = bucket.length - 1; i >= 0 && k>0; i--) {
			if (bucket[i] != null) {
				List<Integer> list = bucket[i];
				res.addAll(list); 
				k -= list.size();
			}
		}

		return res;
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3 };

		List<Integer> result = kmostFrequent(arr, 2);

		for (Integer elem : result) {
			System.out.print(elem + " ");
		}
	}

}

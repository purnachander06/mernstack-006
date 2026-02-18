import java.util.*;
public class SubarraySumEquals{
	public static int subarraySum(int[] nums, int k){
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0,1);
		int prefixSum = 0;
		int Count = 0;
		for(int num : nums){
			prefixSum += num;
			if(map.containsKey(prefixSum - k)){
				Count += map.get(prefixSum - k);
			}
			map.put(prefixSum, map.getOrDefault(prefixSum, 0)+ 1);
		}
		return Count;
	}
	public static void main(String[] args){
		int[] nums = {1,1,1};
		int k = 2;
		System.out.println(subarraySum(nums, k));
	}
}
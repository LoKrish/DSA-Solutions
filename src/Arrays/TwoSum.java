package Arrays;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> visitedElements = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (visitedElements.containsKey(target - nums[i])) {
                return new int[]{visitedElements.get(target - nums[i]), i};
            }
            visitedElements.put(nums[i], i);
        }
        return null;
    }
}

package kfish.leetcode.sequence.positive.to100;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1.两数之和
 * 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
 *
 * @author ikaf woyu2015@sina.com
 * @date Leetcode1.java, v 1.0.0 2022年06月15日 21:39 by ikaf
 */
public class Leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        if (nums == null) {
            return ans;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer index;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            index = map.getOrDefault(target - nums[i], null);
            if (index != null && index != i) {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                return ans;
            }
        }

        for (int i = 0; i < nums.length; i++) {

            index = map.getOrDefault(target - nums[i], null);
            if (index != null && index != i) {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                return ans;
            }
        }

        return ans;
    }
}

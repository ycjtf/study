import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        /*
         * key: target - nums[value]
         * value: 值,key + nums[value] == target
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer integer = map.get(num);
            if (integer != null) {
                return new int[]{integer, num};
            }
            map.put(target - num, i);
        }
        return nums;
    }
}

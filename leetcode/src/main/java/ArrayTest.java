import org.junit.Test;

/**
 * @author wql
 */
public class ArrayTest {

    /**
     * 两个正序数组的中位数
     */
    @Test
    public void findMedianSortedArrays() {
        int[] nums1 = {1, 3, 5, 6, 8, 10, 11};
        int[] nums2 = {1, 2, 4};
        int[] nums = sortedMerge(nums1, nums2);
        int m = nums.length;
        if (m % 2 == 0) {
            System.out.println("中位数:" + (nums[m / 2] - 1 + nums[m / 2]) / 2.0);
        } else {
            System.out.println("中位数:" + nums[m / 2]);
        }
    }

    @Test
    public void t0(){
        System.out.println(1000000008|1000000007);
        System.out.println(1000000008&1000000007);
        System.out.println(1000000008^1000000007);
    }


    /**
     * @param nums1
     * @param nums2
     * @return nums1+nums2
     */
    public static int[] sortedMerge(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m + n];
        int count = 0;
        int i = 0, j = 0;
        while (count != (m + n)) {
            if (i == m) {
                while (j != n) {
                    nums[count++] = nums2[j++];
                }
                break;
            }
            if (j == n) {
                while (i != m) {
                    nums[count++] = nums1[i++];
                }
                break;
            }

            if (nums1[i] < nums2[j]) {
                nums[count++] = nums1[i++];
            } else {
                nums[count++] = nums2[j++];
            }
        }
        return nums;
    }
}

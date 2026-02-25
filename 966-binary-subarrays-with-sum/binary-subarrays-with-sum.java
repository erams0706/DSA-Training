class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int i = 0, j = 0;
        int n = nums.length;
        int sum = 0;
        int zeroCount = 0;
        int count = 0;

        while (j < n) {
            sum += nums[j];

            // shrink window if sum > goal
            while (i < j && sum > goal) {
                if (nums[i] == 0) {
                    zeroCount--;
                } else {
                    zeroCount = 0;
                }
                sum -= nums[i];
                i++;
            }

            // when sum == goal count subarrays
            if (sum == goal) {
                int temp = i;
                int zeros = 0;

                while (temp < j && nums[temp] == 0) {
                    zeros++;
                    temp++;
                }

                count += 1 + zeros;
            }

            j++;
        }

        return count;
    }
}


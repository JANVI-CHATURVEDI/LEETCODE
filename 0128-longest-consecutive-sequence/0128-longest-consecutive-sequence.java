class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int num = 0;
        int count = 0;
        int max = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        for (int x : set) {
            num = x;
            count = 1;

            if (set.contains(num - 1))
                continue;

            while (set.contains(num + 1)) {
                count++;
                num = num + 1;
            }

            max = Math.max(max, count);
        }

        return max;

    }
}
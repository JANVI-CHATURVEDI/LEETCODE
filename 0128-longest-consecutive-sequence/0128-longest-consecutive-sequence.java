class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;  // Edge case: Empty array
        
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {  // Start of a new sequence
                int count = 1;
                int curnum = num;

                while (set.contains(curnum + 1)) {
                    count++;
                    curnum++;
                }

                max = Math.max(max, count);
            }
        }
        return max;
    }
}

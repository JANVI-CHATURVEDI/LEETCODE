
class Solution {
    public boolean circularArrayLoop(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) continue;

            boolean forward = nums[i] > 0;

            int slow = i;
            int fast = i;

            while (true) {

                slow = nextIndex(nums, slow, forward);

                fast = nextIndex(nums, fast, forward);

                if (fast != -1) {
                    fast = nextIndex(nums, fast, forward);
                }

                if (slow == -1 || fast == -1) {
                    break;
                }

                if (slow == fast) {
                    return true;
                }
            }

            int curr = i;

            while (nums[curr] != 0 &&
                   (nums[curr] > 0) == forward) {

                int next = ((curr + nums[curr]) % n + n) % n;

                nums[curr] = 0;
                curr = next;
            }
        }

        return false;
    }

    private int nextIndex(int[] nums, int curr, boolean forward) {

        int n = nums.length;

        if (nums[curr] == 0 ||
            (nums[curr] > 0) != forward) {
            return -1;
        }

        int next = ((curr + nums[curr]) % n + n) % n;

        if (next == curr) {
            return -1;
        }

        if (nums[next] == 0 ||
            (nums[next] > 0) != forward) {
            return -1;
        }

        return next;
    }
}

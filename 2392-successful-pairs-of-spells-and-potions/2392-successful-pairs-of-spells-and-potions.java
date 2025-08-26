class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        Arrays.sort(potions);
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int low = 0, high = m - 1;
            int index = m;  

            while (low <= high) {
                int mid = low + (high - low) / 2;
                long product = (long) spell * potions[mid];

                if (product >= success) {
                    index = mid;    
                    high = mid - 1;  
                } else {
                    low = mid + 1;
                }
            }

            
            result[i] = m - index;
        }

        return result;
    }
}

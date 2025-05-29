class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
           int max = candies[0];  // Start by assuming first element is max

        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];  // Update max if current element is greater
            }
        }

       
         List<Boolean> result = new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies < max){
                result.add(false);
            }
            else{
                 result.add(true);
            }
        }
        return result;
    }
}
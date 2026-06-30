class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        // boolean ans = new boolean[candies.length];
        ArrayList<Boolean> ans = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++){
            if (max < candies[i]){
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++){
            if (max <= candies[i] + extraCandies){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

        return ans;


    }
}
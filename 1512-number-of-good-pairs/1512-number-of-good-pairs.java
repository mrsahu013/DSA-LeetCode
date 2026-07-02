class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        int i = 0;
        int j = 1;

        while (i < n-1){
            if (nums[i] == nums[j]){
                count = count + 1;
            }

            j+=1;

            if (j == n) {
                i += 1;
                j = i + 1;
            }
        }
        return count;
    }
}
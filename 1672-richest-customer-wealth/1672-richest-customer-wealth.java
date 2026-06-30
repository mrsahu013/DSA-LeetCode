class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++){
            int richMan = 0;
            for (int j = 0; j < accounts[i].length; j++){
                richMan += accounts[i][j];

                if (max < richMan){
                    max = richMan;
                }
            }
        }
        return max;
    }
}
class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
         int[] merge = new int[num1.length + num2.length];

        for (int i = 0; i < num1.length; i++){
            merge[i] = num1[i];
        }

        for (int i = 0; i < num2.length; i++) {
            merge[i + num1.length] = num2[i];
        }

        Arrays.sort(merge);

        int even = merge.length % 2;
        double ans;

        if (even == 0){
           int mid = merge.length/2;
           ans = (merge[mid - 1] + merge[mid]) / 2.0;
        }
        else{
            int mid = merge.length / 2;
            ans = merge[mid];
        }

        return  ans;
    }

    
}
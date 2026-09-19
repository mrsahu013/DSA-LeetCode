class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int[] merge = new int[num1.length + num2.length];

        System.arraycopy(num1, 0, merge, 0, num1.length);
        System.arraycopy(num2, 0, merge, num1.length, num2.length);


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
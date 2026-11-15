class Solution {
    public int rob(int[] nums) {
       if(nums.length == 1) return nums[0];
       else if(nums.length == 2) return Math.max(nums[0], nums[1]);
       int n = nums.length;
       return Math.max(robRange(nums, 0, n-2), robRange(nums, 1, n-1));
    }

    private int robRange(int a[], int start, int end){
        int len = end - start +1;
        int d[] = new int[len];
        d[0] = a[start];
        if(len == 1) return d[0];
        d[1] = Math.max(a[start], a[start+1]);
        for(int k = 2; k< len; k++){
            d[k] = Math.max(d[k-2] + a[k+start], d[k-1]);
        }

        return d[len-1];
    }
}

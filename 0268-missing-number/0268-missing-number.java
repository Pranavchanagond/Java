class Solution {
    public int missingNumber(int[] nums) {
    int n=0,i=0;
        while ( i < nums.length) {

            if(n==nums[i]){
                n++;
                i=0;
            }else i++;

        }
        return n;
    }
}

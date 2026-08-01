// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
         int i = m-1;
        int j= n-1;
        int k = m+n-1;

        while(j>=0){
            if (i>=0 && num1[i]>num2[j]){
                num1[k--]= num1[i--];
            }
            else
                num1[k--]= num2[j--];
        }
    }
}

class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // important when k > n

        int j = 0;
        int[] rotArray = new int[n];

        // copy last k elements
        for (int i = n - k; i < n; i++) {
            rotArray[j++] = arr[i];
        }

        // copy first n-k elements
        for (int i = 0; i < n - k; i++) {
            rotArray[j++] = arr[i];
        }

        // copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = rotArray[i];
        }
        
        
    }
}

class Solution {
    public int trap(int[] height) {
        // int n = height.length;
        // int water = 0;
        // for(int i = 0; i < n; i++) {
        //     int leftMax = height[i];
        //     for(int j = 0; j <= i; j++) {
        //         if(height[j] > leftMax) {
        //             leftMax = height[j];
        //         }
        //     }
        //     int rightMax = height[i];
        //     for(int j = i; j < n; j++) {
        //         if(height[j] > rightMax) {
        //             rightMax = height[j];
        //         }
        //     }
        //     water += Math.min(leftMax,rightMax) - height[i];
            
        // }
        // return water;
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
             if(leftMax[i-1] > height[i]) {
                leftMax[i] = leftMax[i-1];
            } 
            else {
                leftMax[i] = height[i];
            }
        }
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            if(rightMax[i+1] > height[i]) {
                rightMax[i] = rightMax[i+1];
            } 
            else {
                rightMax[i] = height[i];
            }
        }
        int water = 0;
        for(int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        
        return water;
    }
}

    
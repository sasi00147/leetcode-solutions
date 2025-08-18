class Solution {
    public int trap(int[] height) {
        int n=height.length;
        //creating the leftmax array
        int left_max[]=new int[n];
        left_max[0]=height[0];
        //filling the left_max array
        for(int i=1;i<n;i++){
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }
        //creating the right max array
        int right_max[]=new int[n];
        right_max[n-1]=height[n-1];
        //filling the right max array
        for(int i=n-2;i>=0;i--){
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }

        int trapped_water=0;
        //storing the trapped water at each bar of the height array
        for(int i=0;i<n;i++){
            //calculating the water level for each index of height array
            int water_level=Math.min(left_max[i],right_max[i]);
            int width=1;
            //formula for calculating the trapped water
            trapped_water+=(water_level-height[i])*width;
            
        }
        return trapped_water;
        
    }
}

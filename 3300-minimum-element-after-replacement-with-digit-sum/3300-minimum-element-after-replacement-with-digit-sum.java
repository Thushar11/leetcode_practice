class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int j=nums[i];
            int sum=0;
            while(j!=0){
                int digit=j%10;
                sum+=digit;
                j/=10;
            }
            
            nums[i]=sum;
        }
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
       
    }
}
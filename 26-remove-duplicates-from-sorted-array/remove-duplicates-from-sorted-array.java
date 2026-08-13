class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int count = 1;
        int i= 0;
        int j=0;
        
        
        while(j<n-1){
            
            if(nums[i] == (nums[j])){
                j++;
            }
            if(nums[i] != nums[j]){
                i++;
                count+=1;
                nums[i]=nums[j];
                
                
                
                
            }
        }
        return count;
        
    }
}
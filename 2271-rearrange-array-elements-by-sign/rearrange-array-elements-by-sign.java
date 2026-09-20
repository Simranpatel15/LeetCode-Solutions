class Solution {
    public int[] rearrangeArray(int[] nums) {
        int sim[] = new int[nums.length];
        int positive = 0;
        int negative = 1;
        for(int i =  0 ; i<nums.length ; i++)
        {
            if(nums[i]>0)
            {
                sim[positive]=nums[i];
                positive+=2;
            }
            else
            {
                sim[negative]=nums[i];
                negative+=2;
            }
        }

        return sim;
        
    }
}
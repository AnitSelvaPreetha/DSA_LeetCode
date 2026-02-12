class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> list=new ArrayList<>(nums.length);

        for(int i=0;i<nums.length;i++)
        {
            list.add(index[i],nums[i]);
        }
         

         int[] result=new int[list.size()];
         for(int i=0;i<result.length;i++)
         {
            result[i]=list.get(i);
         }

         return result;
        
    }
}
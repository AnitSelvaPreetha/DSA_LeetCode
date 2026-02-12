class Solution {
    public int largestAltitude(int[] gain) {


        int[] ans=new int[gain.length+1];
        ans[0]=0;
        for(int i=0;i<gain.length;i++)
        {
            ans[i+1]=ans[i]+gain[i];
        }

        int max=0;

        for(int an:ans)
        {
            if(an>max)
            max=an;
        }
        return max;
    }
}
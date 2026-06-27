class Solution {
    public boolean isPerfectSquare(int num) {


        if(num==1)
        return true;


        int start=1;
        int end=num/2;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(num%mid==0&& (long)num/mid==mid)
            return true;
            else if((long)num/mid<mid)
            end=mid-1;
            else
            start=mid+1;
        }
        return false;
    }
}
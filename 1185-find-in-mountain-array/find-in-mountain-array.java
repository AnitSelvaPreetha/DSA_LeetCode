/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak=findPeak(mountainArr);
    int first=orderBinarySearch(target,mountainArr,0,peak);
        if(first!=-1)
        {
            return first;
        }
        return orderBinarySearch(target,mountainArr,peak+1,mountainArr.length()-1);
        
    }

    public  int findPeak(MountainArray mountainArr)
    {
        int start=0;
        int end=mountainArr.length()-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;

            if(mountainArr.get(mid)>mountainArr.get(mid+1))
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }

    public  int orderBinarySearch(int target,MountainArray mountainArr,int start,int end)
    {
        if(mountainArr.get(start)<mountainArr.get(end))
        {
            while(start<=end)
            {
                int mid=start+(end-start)/2;

                if(mountainArr.get(mid)>target)
                {
                    end=mid-1;
                }
                else if(mountainArr.get(mid)<target)
                {
                    start=mid+1;
                }
                else
                {
                    return mid;
                }
            }
        }
        else
        {
            while(start<=end)
            {
                int mid=start+(end-start)/2;

                if(mountainArr.get(mid)>target)
                {
                    start=mid+1;
                }
                else if(mountainArr.get(mid)<target)
                {
                    end=mid-1;
                }
                else
                {
                    return mid;
                }
            }
        }

        return -1;
    }
}
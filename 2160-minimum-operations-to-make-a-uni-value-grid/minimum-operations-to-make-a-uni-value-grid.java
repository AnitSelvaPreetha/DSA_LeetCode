class Solution {
    public int minOperations(int[][] grid, int x) {

        int m=grid.length;
        int n=grid[0].length;
        
        List<Integer> list=new ArrayList<>();
        int rem=grid[0][0]%x;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]%x!=rem)
                return -1;

                list.add(grid[i][j]);
            }
           
        }

        Collections.sort(list);
        int median=list.get(list.size()/2);


        int moves=0;
        for(int num:list)
        {
            moves+= Math.abs(num-median)/x;
        }
return moves;
        
    }
}
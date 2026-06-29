class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0;
        int sumB=0;

        for(int a:aliceSizes)
        {
            sumA+=a;
        }
        for(int b:bobSizes)
        {
            sumB+=b;
        }

        int diff=(sumB-sumA)/2;

        Set<Integer> set=new HashSet<>();

        for(int a:bobSizes)
        {
            set.add(a);
        }

        for(int b:aliceSizes)
        {
            if(set.contains(b+diff))
            {
                return new int[]{b,b+diff};
            }
        }

return new int[]{0};

    }

}
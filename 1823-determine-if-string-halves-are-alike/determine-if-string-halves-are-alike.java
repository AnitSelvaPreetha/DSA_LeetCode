class Solution {
    public boolean halvesAreAlike(String s) {
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2);

        int count1=0;
        int count2=0;
 String vowels="aeiouAEIOU";

        for(int i=0;i<a.length();i++)
        {
            if(vowels.indexOf(a.charAt(i))!=-1)
            count1++;
           
        }
        for(int j=0;j<b.length();j++)
        {
            if(vowels.indexOf(b.charAt(j))!=-1)
            count2++;
        }
        return count1==count2;
    }
}
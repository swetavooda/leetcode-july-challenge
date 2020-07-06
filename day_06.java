//problem link: https://leetcode.com/problems/plus-one/

// Time complexity O(n)
class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        
        while(i>=0 && digits[i]==9)
        {
            digits[i]=0;
            i--;
        }
        if(i==-1)
        {
            int ans[]= new int[digits.length+1];
            ans[0]=1;
            for(int j=0;j<=digits.length-1;j++)
            {
                ans[j+1]=digits[j];
            }
            return ans;
        }
        else
        {
            digits[i]+=1;
            return digits;
        }
        
        

    }
}
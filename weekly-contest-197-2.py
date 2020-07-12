#problem link: https://leetcode.com/problems/number-of-substrings-with-only-1s/
class Solution:
    def numSub(self, s: str) -> int:
        dp=[0]*len(s)
        ans=0
        if s[0]=='1':
            dp[0]=1
            ans+=1
        for i in range(1,len(s)):
            if s[i]=='1':
                dp[i]=dp[i-1]+1
                ans+=dp[i]
        return ans%1000000007
                
        
//problem link: https://leetcode.com/problems/hamming-distance/

//Time complexity(O(INT_MAX))
class Solution {
    public int hammingDistance(int x, int y) {
        int n=x^y;
        return Integer.bitCount(n);
    }
}

//Improved worst time complexity
class Solution {
    public int hammingDistance(int x, int y) {
        int n=x^y;
        int ans=0;
        while(n!=0)
        {
            n=n&(n-1);
            ans++;
        }
        return ans;
    }
}
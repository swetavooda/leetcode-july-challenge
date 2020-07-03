
//problem link: https://leetcode.com/problems/arranging-coins/

// Time and space complexity O(1)

class Solution {
    public int arrangeCoins(int n) {
    // convert 8n to long to prevent int overflow
        return (int)(Math.sqrt((8L * n + 1)) - 1)/2;
    }
}

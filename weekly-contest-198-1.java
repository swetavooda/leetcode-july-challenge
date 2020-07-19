//problem link: https://leetcode.com/problems/water-bottles

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int full=numBottles,empty=0,drank=0;
        
        while(full!=0)
        {
            drank+=full;
            empty+=full;           
            full=(empty)/numExchange;
            empty=empty%numExchange;
            
        }
        return drank;
    }
}
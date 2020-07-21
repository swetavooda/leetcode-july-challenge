# problem link: https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/

class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        if(len(arr)<=2):
            return True
        arr.sort()
        diff=arr[1]-arr[0]
        for i in range(1,len(arr)):
            d=arr[i]-arr[i-1]
            if d!=diff:
                return False
            
        return True
            
        
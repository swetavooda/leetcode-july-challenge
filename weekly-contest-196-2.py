# problem link : https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank

# Timecomplexity O(n)
# space complexity O(1)
class Solution:
    def getLastMoment(self, n: int, left: List[int], right: List[int]) -> int:
        return max(max(left, default=0), n - min(right, default=n))
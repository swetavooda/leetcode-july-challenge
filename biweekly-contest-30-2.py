# problem link: https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/
class Solution:
    def rangeSum(self, nums: List[int], n: int, left: int, right: int) -> int:
        subs = []
        for i in range(len(nums)):
            n = i+1
            while n <= len(nums):
                sub = nums[i:n]
                subs.append(sum(sub))
                n += 1
        subs.sort()
        ans=subs[left-1:right]
        return sum(ans)


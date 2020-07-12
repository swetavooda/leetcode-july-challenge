#problem link: https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/
class Solution:
    def minDifference(self, A):
            A.sort()
            return min(b - a for a, b in zip(A[:4], A[-4:]))
class Solution:
    def minDifference(self, nums: List[int]) -> int:
        dup={}
        dic={}
        for i in range(0,len(nums)):
            if(nums[i] not in dup):
                dup[nums[i]]=[1,i]
            else:
                dup[nums[i]][0]+=1
            for j in range(i,len(nums)):
                if(i!=j):
                    t=(i,j)
                    v=abs(nums[i]-nums[j])
                    dic[v]=t
        for i in dup:
            if(len(nums)-dup[i][0]<=3):
                return(0)
        l=sorted(dic)#.sort()
        for i in l:
            a,b=dic[i][0],dic[i][1]
            d=max(dup[nums[a]][0],dup[nums[b]][0])
            if nums[a]==nums[b]:
                if len(nums)-2<=3:
                    return(i)
            else:
                if len(nums)-2-(d-1)<=3:
                    return(i)
            
        nums.sort()
        ans=nums[-1]-nums[0]
        ind=[[3,-1],[2,-2],[1,-3],[0,-4]]
        for i in ind:
            ans=min(ans,nums[i[1]]-nums[i[0]])
        return ans

    
                
            
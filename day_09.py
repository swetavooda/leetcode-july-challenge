# problem link: https://leetcode.com/problems/maximum-width-of-binary-tree/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def widthOfBinaryTree(self, root: TreeNode) -> int:
        
        queue = [(root,0)]
        max_width = 0
        
        while queue:
            
            temp = []
            left = float("inf")
            right = float("-inf")
            for node,depth in queue :
                
                left = min(left, depth)
                right = max(right, depth)
                if node.left:
                    temp.append((node.left, 2*depth))
                if node.right:
                    temp.append((node.right, 2*depth+1))
                
            max_width = max(max_width, right-left+1)
            queue = temp
        
        return max_width
    
    
class Solution:
    def widthOfBinaryTree(self, root):
        count=1
        width=[1]
        queue=[[root,0]]
        while(queue!=[]): 
            wl=0
            wr=0    
            w=[]
            for i in range(0,count):           
                t=queue.pop(0)                
                if t[0].left!=None:                                            
                    queue.append([t[0].left,2*t[1]])    
                    w.append(2*t[1])
                   
                if t[0].right!=None:
                    queue.append([t[0].right,2*t[1]+1])                    
                    w.append(2*t[1]+1)
                
            if(w!=[]):
                width.append(max(w)-min(w)+1)
                count=len(queue)
            else:
                break
        
        return max(width)
        
            
                
                
        
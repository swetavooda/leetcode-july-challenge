// problem link: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/


//bfs
class Solution 
{
    public List<List<Integer>> levelOrderBottom(TreeNode root)
    {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            List<Integer> l= new ArrayList<>();
            for(int i=0;i<s;i++)
            {
                TreeNode c= q.poll();
                l.add(c.val);
                if(c.left!=null)
                    q.offer(c.left);
                if(c.right!=null)
                    q.offer(c.right);
                
            }
            ans.add(0,l);
        }
        return ans;
    }
}
//problem link: https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/


/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

// Time complexity O(n)
class Solution {
    private Queue<Node> q = new LinkedList<Node>();
    private Stack<Node> s = new Stack<Node>();
    static Node prev=null;
    Solution()
    {
        prev=null;
    }
    public Node traverse(Node ptr)
    {       
        while(ptr!=null)
        {
            if(prev!=null)
                prev.next=ptr;

            ptr.prev=prev;
            prev=ptr;
            if(ptr.child!=null)
            {
                q.add(ptr.child);
                if(ptr.next!=null)
                    s.push(ptr.next);
                ptr.child=null;
                return ptr.child;
                
            }
            ptr.child=null;
            ptr=ptr.next;                

        }
        return null;
    }
    public Node flatten(Node head) {
        
        Node ptr=head;        
        q.add(head);
        while(q.size()>0 || s.size()>0)
        {
            while(q.size()>0)
                ptr=traverse(q.poll());
            if (s.size()>0)
                ptr=traverse(s.pop());              
                
            
        }
        
        return head;
    }
}
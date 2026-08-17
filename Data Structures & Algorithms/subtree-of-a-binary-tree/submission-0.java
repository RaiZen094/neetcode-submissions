/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  

    public boolean isSameTree(TreeNode p, TreeNode q) {

        TreeNode curr1=p;
        TreeNode curr2=q;
        boolean l,r;
        if((curr1==null || curr2==null)){

            return (curr1==null && curr2==null);
        }

        if((curr1!=null && curr2 !=null)&&(curr1.val!=curr2.val))
        {
                     return false;
                        
        }
        
         else{
                 l=isSameTree(curr1.left,curr2.left);
                 r=isSameTree(curr1.right,curr2.right);

                  return l && r;
            }
                  
        
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

          if(subRoot==null)
              return true;
          else if(root==null & subRoot!=null)
              return false;
          
          if(isSameTree(root,subRoot))
              return true;
          else
             return isSubtree(root.right,subRoot)||isSubtree(root.left,subRoot);
              


    }
}

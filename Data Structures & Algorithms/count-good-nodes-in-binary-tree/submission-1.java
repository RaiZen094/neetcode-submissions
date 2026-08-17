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
        
    int res=0;
    public int goodNodes(TreeNode root) {

        g_Helper(root,root.val);

        return res;
        
    }


    public void g_Helper(TreeNode root,int par){

         
          if(root == null)
               return;

          if(root.val>=par){
                res++;
                par=Math.max(par,root.val);

          }
              

          g_Helper(root.left,par);
          g_Helper(root.right,par);

    }


}

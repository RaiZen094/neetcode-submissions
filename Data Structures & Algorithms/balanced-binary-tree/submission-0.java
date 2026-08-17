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
    public boolean isBalanced(TreeNode root) {

      return dfs(root);
        
    }
    

    public int maxHeight(TreeNode node){
         
         if(node == null)
              return 0;

         return 1+Math.max(maxHeight(node.left),maxHeight(node.right));


    }

    public boolean dfs(TreeNode node){

         if(node==null)
             return true;
          

         return (Math.abs(maxHeight(node.left)-maxHeight(node.right))<=1)
                &&dfs(node.left)&&dfs(node.right);




    }
}

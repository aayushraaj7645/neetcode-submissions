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
    public int diameterOfBinaryTree(TreeNode node) {
        if(node == null){
            return 0;
        }
      int left = diameter(node.left);
        int right = diameter(node.right);
         int max = left+right;
         int sub = Math.max(diameterOfBinaryTree(node.left),
                          diameterOfBinaryTree(node.right));
       return Math.max(max, sub);
       
    }
    public int diameter(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = diameter(node.left);
        int right = diameter(node.right);
    

        return Math.max(left,right)+1;




    }
}

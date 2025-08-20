import javax.swing.tree.TreeNode;

public class balancedtree {
        boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return flag;
    }

    public int helper(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int leftheight = 1+helper(root.left);
        int rightheight = 1+helper(root.right);

        if(Math.abs(leftheight-rightheight)>1)
        {
            this.flag = false;
        }
        return Math.max(leftheight,rightheight);
    }
}

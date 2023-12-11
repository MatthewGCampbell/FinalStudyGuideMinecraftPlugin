package org.matthew.finalstudyguideminecraftplugin;

public class TreeNode {
    private int distanceFromPlayer;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int distanceFromPlayer) {
        this.distanceFromPlayer = distanceFromPlayer;
        this.left = null;
        this.right = null;
    }
}

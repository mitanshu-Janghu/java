// import java.util.ArrayList;
// import java.util.List;
// import java.util.Queue;
// import  java.util.LinkedList;
// import javax.swing.tree.TreeNode;

// public class bfs {
//     public static void main(String[] args) {
        
//     }
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> ans = new ArrayList<>();
// if(root==null) return ans;
// Queue<TreeNode> queue = new LinkedList<>();
// queue.offer(root);
// while(!queue.isEmpty()){
// int level = queue.size();
//  List<Integer> list = new ArrayList<>();
//  for(int i =0 ;i<level;i++){
// TreeNode currentnode=queue.poll();
// list.add(currentnode.val);
// if(currentnode.left!=null){
//     queue.offer(currentnode.left);
// }
// if(currentnode.right!=null){
//     queue.offer(currentnode.right);
// }}
// ans.add(list);
 
// }

// return ans;
//     }
// }

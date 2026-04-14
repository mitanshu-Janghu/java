public class trees {
    public static class Node {
    int val;
    Node right;
    Node left;
      public Node(int v)  {
        val = v;
      }
      public static void display( Node root ){
        if(root==null) return ;
        System.out.print(root.val+" -> ");
        if(root.left!=null )System.out.print(root.left.val + "  ");
        if(root.right!=null ) System.out.print(root.right.val );
        System.out.println();
        display(root.left);
        display(root.right);
      }
    }
  public static void main(String[] args) {
    Node root = new Node(1);
    
     Node a = new Node(2);
     Node b = new Node(3);
     root.left=a;
     root.right=b;

    root.display(root);
  }  
}

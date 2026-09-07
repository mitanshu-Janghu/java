public class learingstree {
    class Node{
        int value;
        int ri;
        int li;
        Node left;
        Node right; 
    public Node(int ri , int li ){
        this.li=li;
        this.ri=ri;
    }
}
Node root;
public learingstree(int[] arr){
    this.root=constructtree(arr,0,arr.length-1);
}
Node constructtree(int[] arr, int s , int l){
if(s==l)
    {Node leaf = new Node(s,l);
        leaf.value=arr[s];
        return leaf;
    }
    int mid = (s + l) / 2;

    Node node = new Node(s,l);
    node.left=constructtree(arr, s, mid);
    node.right=constructtree(arr,mid+1,s);
    return node;
}
public void display() {
    display(this.root);
  }
  private void display(Node node) {
    String str = "";

    if(node.left != null) {
      str = str + "Interval=[" + node.left.ri + "-" + node.left.li + "] and data: " + node.left.value + " => "; 
    } else {
      str = str + "No left child";
    }

    // for current node
    str = str + "Interval=[" + node.ri + "-" + node.li + "] and data: " + node.value + " <= "; 
    
    if(node.right != null) {
      str = str + "Interval=[" + node.right.ri + "-" + node.right.li + "] and data: " + node.right.value; 
    } else {
      str = str + "No right child";
    }

    System.out.println(str + '\n');

    // call recursion
    if(node.left != null) {
      display(node.left);
    }

    if(node.right != null) {
      display(node.right);
    }
  }


  public int query(int qsi, int qei) {
    return this.query(this.root, qsi, qei);
  }
  private int query(Node node, int qsi, int qei) {
    if(node.li>=qsi && node.ri<=qsi){
        return node.value;
    }
    else if(node.li > qei ||  node.ri < qsi){
        return 0;
    }
    return query(node.left,qsi, qei) + query(node.right,qsi, qei) ;
  }
}

public class node {
   private  int val;
   private node next;
   private node head;
   private node tail;
   public node(){

this.val=0;
this.next= null;
   }
   public node(int val){

this.val=val;
this.next= null;
   }
   public node(int val,node n){

this.val=val;
this.next= n;
   }
   node insertrec(int val , int index){
return insertrec(val,index,head);
   }
   node insertrec(int val , int index,node n){
      if(index==0){
         node temp = new node(val,n);
         return temp;
      }
      n.next = insertrec(val, index-1, n.next);
      return n ;
   }
   void add(int val){
node node1 = new node(val);
node1.next=head;
head=node1;
   }
   void display(){
      node temp = head;
      while(temp!=null){
         System.out.print(temp.val + " -> ");
         temp=temp.next;
      }
      System.out.println(" NULL ");
      
   }
    public boolean hasCycle(node head) {

        if (head == null || head.next == null) {
            return false;
        }

        node slow = head;
       node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

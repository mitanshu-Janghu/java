public class mergelists {
   public static void main(String[] args) {
    LL list=new LL();
       LL list2=new LL();
        list.insertlast(1); 
        list.insertlast(2);
        list.insertlast(3);
        list2.insertlast(1); 
        list2.insertlast(2);
        list2.insertlast(3);
   } 

// public LL mergeTwoListsRecursive(LL l1, LL l2) {
//     if (l1 == null) return l2;
//     if (l2 == null) return l1;
//     if (l1.val <= l2.val) {
//         l1.next = mergeTwoListsRecursive(l1.next, l2);
//         return l1;
//     } else {
//         l2.next = mergeTwoListsRecursive(l1, l2.next);
//         return l2;
//     }
// }
}

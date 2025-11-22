public class add1skip {
    public static void main(String[] args) {
        int[] nums={444,1,2,199};
        
        int p1 =0,p2=0;
        for (int i = 0 ; i<nums.length;i++){
            int sum=nums[i]+p2;
            int skip=p1;
            int curr=Math.max(sum, skip);
            p2=p1;
            p1=curr;
            System.out.println("line   "+i+"  curr   "+curr+"\t p1   "+p1+"\tp2   "+p2);
    }
    }
}

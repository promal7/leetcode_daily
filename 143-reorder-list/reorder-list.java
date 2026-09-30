/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode curr=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        int l=0, r=arr.size()-1;
        ArrayList<Integer> res=new ArrayList<>();
        while(l<=r){
           res.add(arr.get(l));
           if(l!=r){
            res.add(arr.get(r));
           }
           l++;
           r--;
        }
        int index=0;
        curr=head;
        for(int i=0; i<res.size(); i++){
            curr.val=res.get(i);
            curr=curr.next;
        }
    }
}
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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> smaller=new ArrayList<>();
        ArrayList<Integer> greater=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                smaller.add(curr.val);
                
            }else{
                greater.add(curr.val);
               
            }
            curr=curr.next;
        }
        smaller.addAll(greater);
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        for(int val: smaller){
            temp.next=new ListNode(val);
            temp=temp.next;
        }
        return dummy.next;
    }
}
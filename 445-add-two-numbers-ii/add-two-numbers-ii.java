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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int carry=0;
        while(l1!=null){
            list1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            list2.add(l2.val);
            l2=l2.next;
        }
        int i=list1.size()-1, j=list2.size()-1;
        while(i>=0 || j>=0 || carry!=0){
            int sum=carry;
            if(i>=0){
                sum+=list1.get(i--);
            }
            if(j>=0){
                sum+=list2.get(j--);
            }
           ans.add(sum%10);
           carry=sum/10;
        }
        Collections.reverse(ans);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
       for(int digit: ans){
        curr.next=new ListNode(digit);
        curr=curr.next;
       }
       return dummy.next;

    }
}
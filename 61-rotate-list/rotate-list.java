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
    public void reverse(ArrayList<Integer> arr, int start, int end){
        while(start<end){
             int temp=arr.get(start);
        arr.set(start, arr.get(end));
        arr.set(end, temp);
        start++;
        end--;

        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int n=arr.size();
        k=k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        int index=0;
        temp=head;
        while(temp!=null){
            temp.val=arr.get(index++);
            temp=temp.next;
        }
        return head;

    }
}
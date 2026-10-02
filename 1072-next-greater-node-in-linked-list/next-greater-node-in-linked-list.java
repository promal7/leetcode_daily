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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int n=arr.size();
        int[] ans=new int[n];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr.get(i)<arr.get(j)){
                    ans[i]=arr.get(j);
                    break;
                }
            }
        }
        return ans;
    }
}
import java.util.PriorityQueue;

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
  public ListNode mergeKLists(ListNode[] lists) {
    if (lists==null || lists.length == 0) {
      return null;
    }
    PriorityQueue<ListNode> minHeap = new PriorityQueue<>(lists.length, (x, y) -> x.val - y.val);

    for (ListNode node : lists) {
      if (node != null) minHeap.add(node);
    }
    ListNode head = new ListNode(0);
    ListNode tail = head;

    while (!minHeap.isEmpty()) {
      tail.next = minHeap.poll();
      tail = tail.next;

      if (tail.next != null) {
        minHeap.add(tail.next);
      }
    }
    return head.next;
  }
}
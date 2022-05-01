package xyz.fusheng.leetcode;

/**
 * @FileName: No206SingleLinkedReverse
 * @Author: code-fusheng
 * @Date: 2022/4/28 09:23
 * @Version: 1.0
 * @Description: No.206单链表反转
 */

public class No206SingleLinkedReverse {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}


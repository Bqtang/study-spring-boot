package com.example.demo.leetcode.bytedance;

/**
 * @Description: 反转链表
 * @Auther: tangbingqun
 * @Date: 2021/2/22 2:34 PM
 *
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 */

public class ReverseList_206 {

     public class  ListNode{
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     }

     /**
      * 迭代方式链表反转
      * 链表反转
      * @param head
      * @return
      */
     public ListNode reverseList_iteration(ListNode head) {
          ListNode  prev = null;
          ListNode  curr = head;
          while (curr != null){
               ListNode next = curr.next;
               curr.next = prev;
               prev = curr;
               curr = next;
          }
          return prev;
     }

     /**
      * 递归方式链表反转
      * @param head
      * @return
      */
     public ListNode reverseList_recursion(ListNode  head){
          if (head == null || head.next == null){
               return head;
          }
          ListNode p = reverseList_recursion(head.next);
          head.next.next = head;
          head.next = null;
          return p;
     }



}

package easy.Week1;

/**
 * @author Weichen Wang
 * @date 2020/11/8 - 4:05 下午
 * @description: 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode res = new ListNode();
        ListNode cur = res;

        // 只有当 l1 & l2 != null，才能进行下面的if判断
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        // 当结束上面while后，说明 l1 or l2 == null，
        // l1 == null 说明l1已经结束了，只剩下l2
        if (l1 == null) {
            cur.next = l2;
        }
        if (l2 == null) {
            cur.next = l1;
        }

        return res.next;
    }

    public class ListNode {
        int val; // node的值
        ListNode next; // 指针 指向下一个node

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

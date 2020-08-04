package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Weichen Wang
 * @date 2020/8/1 - 9:25 AM
 * @description: ${description}
 */
public class DeleteMidNode {
    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

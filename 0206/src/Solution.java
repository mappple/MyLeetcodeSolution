public class Solution {
    /**
     * 递归法
     * 时间复杂度 0(n)
     * 空间复杂度 O(n)
     * 1 假设链表是[1, 2, 3, 4, 5]从最底层最后一个reverseList(5)来看
     * 2 返回了5这个节点
     * 3 reverseList(4)中
     * 4 p为5
     * 5 head.next.next = head 相当于 5 -> 4
     * 6 现在节点情况为 4 -> 5 -> 4
     * 7 head.next = null,切断4 -> 5 这一条，现在只有 5 -> 4
     * 8 返回（return）p为5，5 -> 4
     * 9 返回上一层reverseList(3)
     * 10 处理完后返回的是4 -> 3
     * 11 依次向上
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public ListNode reverseList2(ListNode head) {
        //申请节点，pre和 cur，pre指向null
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp;
        while(cur!=null) {
            //记录当前节点的下一个节点
            tmp = cur.next;
            //然后将当前节点指向pre
            cur.next = pre;
            //pre和cur节点都前进一位
            pre = cur;
            cur = tmp;
        }
        return pre;
//        作者：user7439t
//        链接：https://leetcode-cn.com/problems/reverse-linked-list/solution/dong-hua-yan-shi-206-fan-zhuan-lian-biao-by-user74/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    }
}

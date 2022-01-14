public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l12 = new ListNode(3);
        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(4);
        l2.next = l21;
        l21.next = l22;
        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyHead = new ListNode();
        ListNode prev = dummyHead;

        while (l1 != null || l2 != null) {
            var v1 = l1 != null ? l1.val : 0;
            var v2 = l2 != null ? l2.val : 0;
            var sum = (v1 + v2 + carry) % 10;
            carry = (v1 + v2 + carry) >= 10 ? 1 : 0;

            var curr = new ListNode(sum);
            prev.next = curr;
            prev = curr;

            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        prev.next = carry == 0 ? null : new ListNode(1);
        return dummyHead.next;
    }
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
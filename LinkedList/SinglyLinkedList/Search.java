public class Search {
    public static void main(String[] args) {
        // Search an element in a Linked
        // creating a new list
        LinkedList list = new LinkedList();

        push(list, 31);
        push(list, 5);
        push(list, 123);
        print(list);

        // search 2 in list
        System.out.println("\nPosition: " + search(list, 123));
        ;
    }

    static int search(LinkedList list, int val) {
        int pos = 0;
        // iterating over linked list
        ListNode cur = list.head;
        while (cur != null) {
            if (cur.val == val) {
                return pos;
            }
            pos++;
            cur = cur.next;
        }

        return -1;
    }

    static class LinkedList {
        ListNode head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static void push(LinkedList list, int val) {
        // create a new node
        ListNode node = new ListNode(val);

        // list empty?
        if (list.head == null) {
            list.head = node;
            return;
        }

        // list not empty
        node.next = list.head;
        list.head = node;
    }

    static void print(LinkedList list) {
        ListNode cur = list.head;
        while (cur != null) {
            System.out.print(cur.val + ", ");
            cur = cur.next;
        }
    }
}

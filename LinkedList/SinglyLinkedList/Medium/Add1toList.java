package Medium;

import x.*;

public class Add1toList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(9);
        l1.append(9);
        l1.append(9);

        // reverse
        reversal(l1);
        // add 1 to 999
        addOne(l1);
        // reverse
        reversal(l1);
        l1.print();
    }

    static void addOne(LinkedList l) {
        Node cur = l.head, prev = null;
        int carry = 1;
        // 1->2->3->4
        // add carry to all values
        while (cur != null) {
            int sum = carry + cur.val;
            cur.val = sum % 10;
            carry = sum / 10;

            prev = cur;
            cur = cur.next;
        }

        if (carry == 1) {
            prev.next = new Node(1);
        }
    }

    static void reversal(LinkedList list) {
        // using 3 references
        // input: head->1->2->3->4->null
        // null<-1<-2<-3<-4<-head
        // output: null<-1<-2<-3<-4<-head
        Node current = list.head, prev = null, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head = prev;
    }

}

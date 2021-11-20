package Easy;

import x.*;

public class Traversal {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.append(1);
        l.append(2);
        l.append(3);
        l.head.next.next.next = l.head;
        l.print();
    }

    // public void print() {
    // Node cur = this.head;

    // // if no node
    // if (cur == null) {
    // System.out.println("List is empty");
    // return;
    // }

    // // iterate over the list to print data in each node.
    // while (cur.next != head) {
    // System.out.print(cur.val + ", ");
    // cur = cur.next;
    // }
    // System.out.print(cur.val + ", ");
    // }
}

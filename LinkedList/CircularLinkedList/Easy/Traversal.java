package Easy;

import ListPackage.*;

public class Traversal {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.append(1);
        l.append(2);
        l.append(3);
        l.head.next.next.next = l.head;
        l.print();
    }
}

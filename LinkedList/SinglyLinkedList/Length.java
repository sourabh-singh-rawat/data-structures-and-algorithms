public class Length {
    public static void main(String[] args) {
        List list = new List();

        list.push(3);
        list.push(2);
        list.push(1);
        list.print();
        list.length();
        list.recursiveLength();
    }

    static class List {
        Node head;

        class Node {
            int data;
            Node next;

            Node(int d) {
                this.data = d;
            }
        }

        void push(int data) {
            Node node = new Node(data);

            // list empty?
            if (head == null) {
                head = node;
                return;
            }

            // list not empty
            node.next = head;
            head = node;
        }

        void length() {
            int count = 0;
            Node ptr = head;
            while (ptr != null) {
                count++;
                ptr = ptr.next;
            }

            System.out.println("\nLength: " + count);
        }

        void recursiveLength() {
            // System.out.println("Length: " + recursiveLengthInner(head));

        }

        int recursiveLengthInner(Node head) {
            // base case
            if (head == null) {
                return 0;
            }

            return recursiveLengthInner(head.next) + 1;
        }

        void print() {
            // list empty?
            if (this.head == null) {
                System.out.println("List is empty.");
                return;
            }

            // list not empty
            Node ptr = this.head;
            while (ptr != null) {
                System.out.print(ptr.data + ", ");
                ptr = ptr.next;
            }
        }
    }
}

class Deletion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.deletePosition(1);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        list.print();
        list.deletePosition(4);
        list.print();
    }

    static class LinkedList {
        Node head;

        class Node {
            int data;
            Node next;

            Node(int d) {
                this.data = d;
                this.next = null;
            }
        }

        void push(int data) {
            Node node = new Node(data);
            node.next = this.head;
            this.head = node;
        }

        void deletePosition(int position) {
            // list empty?
            if (this.head == null) {
                System.out.println("cannot delele list is empty");
                return;
            }

            Node curr = this.head;
            Node prev = null;
            // list not empty
            // iterate over list till we reach position
            for (int i = 0; curr != null && i < position; i++) {
                prev = curr;
                curr = curr.next;
            }

            // position more than no of nodes
            if (curr == null) {
                System.out.println("Position out of bound");
                return;
            }

            // delete first value
            if (prev == null) {
                this.head = this.head.next;
                return;
            }

            // delete
            prev.next = curr.next;
        }

        void deleteValue(int value) {
            // check if list is empty
            if (this.head == null) {
                System.out.println("Cannot delete. List is empty");
                return;
            }

            // list not empty
            // search for value in list
            Node curr = this.head;
            Node prev = null;

            while (curr != null) {
                if (curr.data == value) {
                    break; // curr value is the value where data is found
                }
                prev = curr;
                curr = curr.next;
            }

            if (curr == null) {
                System.out.println("Cannot delete. Item not found in the list.");
                return;
            }

            // item to be deleted is the first item
            if (prev == null) {
                this.head = null;
                return;
            }

            // delete
            prev.next = curr.next;
        }

        void print() {
            Node curr = this.head;

            // list empty
            if (curr == null) {
                System.out.println("List is empty.");
                return;
            }

            // list not empty
            while (curr != null) {
                System.out.print(curr.data + ", ");
                curr = curr.next;
            }

            System.out.println("");
        }
    }

}
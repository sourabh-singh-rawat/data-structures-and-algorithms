class ListInsertion {
    // individual linked list
    static class LinkedList {
        Node head;
    }

    // individual node
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // main function ----------------------------------------------------------------------------------
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        insertAtEnd(list, 2);
        insertAtEnd(list, 3);
        insertAtStart(list, 1);
        printList(list);
    }

    // insert at the start of the list ----------------------------------------------------------------
    static void insertAtStart(LinkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = list.head;
        list.head = new_node;
    }

    // insert at the end of the list
    static void insertAtEnd(LinkedList list, int data) {
        Node new_node = new Node(data);

        // if list empty
        if (list.head == null) {
            list.head = new_node;
            return;
        }
        
        // list not empty so find the last node
        Node curr = list.head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = new_node;
    }

    // print data inside the list
    static void printList(LinkedList list) {
        Node curr = list.head;

        // if no node
        if (list.head == null) {
            System.out.println("List is empty");
            return;
        }

        // iterate over the list to print data in each node.
        while(curr!=null) {
            System.out.print(curr.data + ", ");
            curr = curr.next;
        }
    }
}
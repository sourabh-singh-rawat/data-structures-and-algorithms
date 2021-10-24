class ListInsertion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.print();
    }

    static class LinkedList {
        Node head;
        
        class Node {
            int data;
            Node next;
            
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        void push(int data) {
            Node new_node = new Node(data);
            new_node.next = this.head;
            this.head = new_node;
        }
        
        void append(int data) {
            Node new_node = new Node(data);

            // if list empty
            if (this.head == null) {
                this.head = new_node;
                return;
            }
            
            // list not empty so find the last node
            Node curr = this.head;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = new_node;
        }
        
        void print() {
            Node curr = this.head;

            // if no node
            if (this.head == null) {
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
}
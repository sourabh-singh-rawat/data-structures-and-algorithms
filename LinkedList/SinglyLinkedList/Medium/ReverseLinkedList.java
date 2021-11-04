import java.util.Stack;

class ReversedLinkedList {
    public static void main(String[] args) {
        // list
        LinkedList list = new LinkedList();
        push(list, 4);
        push(list, 3);
        push(list, 2);
        push(list, 1);
        System.out.println("Original List: ");
        print(list);

        reversal(list);
        System.out.println("\nReversed List: ");
        print(list);

        LinkedList list2 = new LinkedList();
        push(list2, 1);
        push(list2, 2);
        push(list2, 3);
        push(list2, 2);
        push(list2, 1);

        System.out.println("\n\nList 2");
        print(list2);
        System.out.println(isPalindrome(list2) ? "is palindrome" : "is not Palindrome");
    }

    static class LinkedList {
        Node head;
    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static void push(LinkedList list, int val) {
        // create a node
        Node node = new Node(val);

        // list empty?
        if (list.head == null) {
            list.head = node;
            return;
        }

        node.next = list.head;
        list.head = node;
    }

    static void print(LinkedList list) {
        // using cursor to iterate over list
        Node cur = list.head;

        while (cur != null) {
            System.out.print(cur.val + ", ");
            cur = cur.next;
        }
    }

    // linked list reversal
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

    static boolean isPalindrome(LinkedList list) {
        // if list empty return
        if (list.head == null)
            return false;

        // using stacks
        Stack<Integer> stack = new Stack<Integer>();
        // iterate over list and storing in stack
        Node cur = list.head;
        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }

        cur = list.head;
        while (cur != null) {
            int val = stack.pop();
            if (cur.val != val) {
                return false;
            }
            cur = cur.next;
        }

        return true;
    }
}
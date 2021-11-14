package Easy;

import x.*;

public class Mid {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.push(11);
        list.push(31);
        list.push(23);
        list.push(2);
        list.push(14);
        midFS(list);
    }

    static void mid(LinkedList list) {
        int mid = list.length() / 2;

        // iterate over the loop mid times
        Node cur = list.head;
        for (int i = 0; i < mid; i++) {
            cur = cur.next;
        }

        System.out.println(cur.val);
    }

    static void midFS(LinkedList list) {
        // travese list using fast and slow pointers
        Node curFast = list.head;
        Node curSlow = list.head;

        while (curFast != null && curFast.next != null) {
            curFast = curFast.next.next;
            curSlow = curSlow.next;
        }

        System.out.println("Mid: " + curSlow.val);
    }

}

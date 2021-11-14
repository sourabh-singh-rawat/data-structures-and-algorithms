package Easy;

import x.*;

class Loop {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(77);
        list.push(31);
        list.push(22);
        list.push(21);

        // 21->22->31->77->21
        list.head.next.next.next.next = list.head;
        loopLength(list);
    }

    static void loopLength(LinkedList list) {
        // check if loop exist with floyd algo
        Node curSlow = list.head, curFast = list.head;
        while (curFast != null && curFast.next != null) {
            curFast = curFast.next.next;
            curSlow = curSlow.next;

            if (curFast == curSlow) {
                System.out.println("Loop Exists");
                break;
            }
        }

        // if loop doesn't exist
        if (curFast != curSlow) {
            System.out.println("Loop doesn't exists");
            return;
        }

        // curFast = curSlow
        int count = 1;
        while (curSlow.next != curFast) {
            count++;
            curSlow = curSlow.next;
        }

        System.out.println("Loop Length: " + count);
    }

    static boolean checkLoop(LinkedList list) {
        // iterate of list and assign node visited = true
        Node cur = list.head;
        while (cur != null) {
            if (cur.visited)
                return true;
            cur.visited = true;
            cur = cur.next;
        }

        return false;
    }

    static boolean floydLoopDetection(LinkedList list) {
        // iterate using fast and slow cur
        Node curFast = list.head;
        Node curSlow = list.head;

        while (curFast != null && curFast.next != null) {
            curFast = curFast.next.next;
            curSlow = curSlow.next;

            if (curSlow == curFast) {
                return true;
            }
        }

        return false;
    }

}

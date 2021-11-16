class Stack {
    public static void main(String[] args) {
        myStack s = new myStack(100);

        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        System.out.println("remove top three elements");
        s.pop();
        s.pop();
        s.pop();
        s.print();
        s.push(4);
        s.peek();
    }

    static class myStack {
        int limit;
        int[] storage;
        int top;

        myStack(int l) {
            this.limit = l;
            this.storage = new int[limit];
            this.top = -1;
        }

        int push(int val) {
            if (top >= this.limit - 1) {
                System.out.println("overflow");
                return 0;
            }
            // update top
            this.top++;
            this.storage[top] = val;
            return val;
        }

        void peek() {
            if (isEmpty()) {
                System.out.println("Cannot peek top element. List empty");
                return;
            } else
                System.out.println(this.storage[this.top] + " <- top");
        }

        void pop() {
            if (isEmpty()) {
                System.out.println("Cannot delete. Stack is empty");
                return;
            }
            this.top--;
        }

        boolean isEmpty() {
            if (this.top < 0)
                return true;
            else
                return false;
        }

        void print() {
            if (isEmpty()) {
                System.out.println("Nothing to print. Stack is empty.");
                return;
            }

            int top = this.top;
            for (int i = top; i >= 0; i--) {
                if (i == top)
                    System.out.println(this.storage[i] + " <- top");
                else
                    System.out.println(this.storage[i] + ", ");
            }
        }

    }
}
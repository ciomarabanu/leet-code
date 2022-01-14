public class StackImplementation {
    public static void main(String[] args) {
        Stack s = new StackImpl();
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.push(5);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }


}

class StackImpl implements Stack {
    public StackImpl(){}
    private class Node {
        int value;
        Node prevNode;

        public Node(int value, Node prevNode) {
            this.value = value;
            this.prevNode = prevNode;
        }
    }

    Node head;

    @Override
    public Integer peek() {
        if (head == null){
            throw new IndexOutOfBoundsException("Stack is empty");
        } else {
            return this.head.value;
        }
    }

    @Override
    public Integer pop() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        int poppedHead = head.value;
        head = head.prevNode;
        return poppedHead;
    }

    @Override
    public void push(Integer i) {
        head = new Node(i, head);
    }
}

interface Stack {
    public Integer peek();

    public Integer pop();

    public void push(Integer i);
}
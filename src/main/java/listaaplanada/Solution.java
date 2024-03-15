package listaaplanada;

class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;

        Node current = head;

        while (current != null) {
            if (current.child != null) {
                Node next = current.next;
                Node child = flatten(current.child);
                current.next = child;
                child.prev = current;
                current.child = null;

                while (child.next != null) {
                    child = child.next;
                }

                child.next = next;

                if (next != null) {
                    next.prev = child;
                }
            }
            current = current.next;
        }

        return head;
    }
}

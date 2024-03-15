package listaaplanada;

class FlattenDLL {
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Construye la lista de ejemplo
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;
        head.child = new Node(5);
        head.child.next = new Node(6);
        head.child.next.prev = head.child;
        head.child.child = new Node(7);
        head.child.child.next = new Node(8);
        head.child.child.next.prev = head.child.child;
        head.next.next.child = new Node(9);
        head.next.next.child.next = new Node(10);
        head.next.next.child.next.prev = head.next.next.child;


        Solution solution = new Solution();
        Node flattened = solution.flatten(head);


        printList(flattened);
    }
}

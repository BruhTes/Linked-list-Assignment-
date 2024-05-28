public class SinglyLinkedList {
    private Node head;
    
    public SinglyLinkedList() {
        head = null;
    }

    // Method to get the head node (for testing purposes)
    public Node getHead() {
        return head;
    }
    
    // Method to insert a node at a specified position
    public void insertAtPos(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            throw new IllegalArgumentException("Position out of bounds");
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    


    // Method to delete a node at a specified position
    public void deleteAtPosition(int position) {
        if (head == null) {
            throw new IllegalArgumentException("List is empty");
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            throw new IllegalArgumentException("Position out of bounds");
        }
        current.next = current.next.next;
    }



    // Method to delete a node after a given node
    public void deleteAfterNode(Node prevNode) {
        if (prevNode == null || prevNode.next == null) {
            throw new IllegalArgumentException("Invalid node");
        }
        prevNode.next = prevNode.next.next;
    }



    // Method to search for a node with a specific value
    public boolean searchNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }



    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

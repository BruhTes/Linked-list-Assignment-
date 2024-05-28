public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Inserting nodes at specified positions
        list.insertAtPos(10, 1);
        list.insertAtPos(20, 2);
        list.insertAtPos(30, 3);
        list.insertAtPos(25, 3);
        System.out.println("Linked list after insertions:");
        list.display();

        // Deleting node at a specified position
        list.deleteAtPosition(3);
        System.out.println("Linked list after deleting node at position 3:");
        list.display();

        // Deleting node after a given node
        Node secondNode = list.getHead().next; // Assuming the second node exists
        list.deleteAfterNode(secondNode);
        System.out.println("Linked list after deleting node after the second node:");
        list.display();

        // Searching for a node with a specific value
        System.out.println("Searching for node with value 20: " + list.searchNode(20));
        System.out.println("Searching for node with value 30: " + list.searchNode(30));
    }
}
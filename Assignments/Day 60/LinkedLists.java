class Node {
    int data; // Data stored in the node
    Node next; // Reference to the next node

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head; // The first node in the linked list

    public void add(int data) {
        Node newNode = new Node(data);

        // If the linked list is empty, make the new node the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse the linked list to find the last node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            // Connect the new node to the last node
            current.next = newNode;
        }
    }

    public void addAtIndex(int data, int index) {
        int indexAt = 0;
        Node current = head;
        Node newNode = new Node(data);
        while (current != null) {
            if (indexAt == (index - 1)) {
                Node nodeAfter = current.next;
                current.next = newNode;
                newNode.next = nodeAfter;
                // break;
            }
            current = current.next;
            indexAt = indexAt + 1;
        }
    }

    public void delete(int data) {
        Node current = head;
        while (current != null) {
            if (current.next.data == data) {
                current.next = current.next.next; // Skip the node to be deleted by connecting the current node to the
                                                  // next one
                break;
            }
            current = current.next;
        }
    }

    public void printNodes() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the linked list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.addAtIndex(4, 3);
        list.delete(2);

        // Print all the nodes in the linked list
        list.printNodes();
    }
}

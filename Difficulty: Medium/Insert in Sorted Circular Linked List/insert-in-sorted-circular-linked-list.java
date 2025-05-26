/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node newNode = new Node(data);
        
        // If the list is empty, the new node points to itself
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        
        // Step 2: If data needs to be inserted before the head node (sorted order)
        // We check if new data is smaller than or equal to the head data
        if (data <= head.data) {
            // Find the last node to update its next pointer to the new node
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode; // Last node points to the new node
            newNode.next = head; // New node points to head
            return newNode; // Update head to the new node
        }
        
        // Step 3: Otherwise, traverse the list to find the correct position
        Node current = head;
        while (current.next != head && current.next.data < data) {
            current = current.next;
        }
        
        // Step 4: Insert the new node after the current node
        newNode.next = current.next;
        current.next = newNode;
        
        return head;
    }
    public void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
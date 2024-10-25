class Node {
    int data;
    Node next;
    
    Node(int key) {
        data = key;
        next = null;
    }
}

class Solution {
    public static int count(Node head, int key) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                count++;
            temp = temp.next;
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 2 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);

        int key = 2;
        int occurrences = Solution.count(head, key);
        System.out.println("The number " + key + " appears " + occurrences + " times in the linked list.");
    }
}

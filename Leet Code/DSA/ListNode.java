
// Given the head of a singly linked list, reverse the list, and return the reversed list.

 

// Example 1:


// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
// Example 2:


// Input: head = [1,2]
// Output: [2,1]
// Example 3:

// Input: head = []
// Output: []
 

// Constraints:

// The number of nodes in the list is the range [0, 5000].
// -5000 <= Node.val <= 5000
 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;   
        ListNode curr = head;   

        while (curr != null) {
            ListNode next = curr.next; 
            curr.next = prev;          
            prev = curr;                
            curr = next;                 
        }
        return prev;
    }
}


// Normal Code for reversing a linked list in Java with user input and output:


// import java.util.*;

// public class ReverseLinkedList {

//     // Node class represents a single element of the linked list.
//     // Each node stores an integer value ('data') and a reference
//     // to the next node in the list ('next').
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             // 'next' is automatically null until we link it manually
//         }
//     }

//     // Reverses a singly linked list in-place and returns the new head.
//     // Uses the classic 3-pointer technique: prev, curr, next.
//     static Node reverse(Node head) {
//         Node prev = null;   // will become the new head at the end
//         Node curr = head;   // pointer that walks through the original list

//         while (curr != null) {
//             Node next = curr.next; // save the next node before we overwrite curr.next
//             curr.next = prev;      // reverse the link: point curr backward to prev
//             prev = curr;           // move prev forward to curr
//             curr = next;           // move curr forward to the saved next node
//         }

//         // When curr becomes null, prev is sitting on the last node
//         // processed, which is now the head of the reversed list.
//         return prev;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Ask the user how many nodes they want to create
//         System.out.print("Enter number of nodes: ");
//         int n = sc.nextInt();

//         // head = first node of the list, tail = last node (for easy appending)
//         Node head = null, tail = null;

//         System.out.println("Enter " + n + " values:");
//         for (int i = 0; i < n; i++) {
//             Node node = new Node(sc.nextInt()); // read a value and create a node

//             if (head == null) {
//                 // first node being added — it becomes both head and tail
//                 head = node;
//                 tail = node;
//             } else {
//                 // link the new node after the current tail, then update tail
//                 tail.next = node;
//                 tail = node;
//             }
//         }

//         // Reverse the list we just built
//         Node newHead = reverse(head);

//         // Print the reversed list in "a -> b -> c" format
//         System.out.print("Reversed list: ");
//         for (Node cur = newHead; cur != null; cur = cur.next) {
//             System.out.print(cur.data + (cur.next != null ? " -> " : ""));
//         }

//         sc.close(); // always close the Scanner when done reading input
//     }
// }
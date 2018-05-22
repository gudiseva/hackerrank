package java7.linked.lists.detect.a.cycle;

import java.util.LinkedList;

/*
 * Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
 */
public class Solution {

	// head of list
	Node head;  
	
	// Linked list Node
	class Node {
	    int data;
	    Node next;
	    
	    Node(int data) {
	    	this.data = data;
	    	next = null;
	    }
	    
	}
	
    // Floyd’s Cycle-Finding Algorithm
    boolean hasCycle(Node head) {
    	
    	Node slowNode = head;
    	Node fastNode = head;
    	
    	while (slowNode != null && fastNode != null && fastNode.next != null) {
    		slowNode = slowNode.next;
    		fastNode = fastNode.next.next;
    		
    		if (slowNode == fastNode){
    			// Loop found
    			return true;
    		}
    	}
    	
    	return false;

    }

    // Inserts a new Node at front of the list.
    public void push(int new_data)
    {
        // 1 & 2: Allocate the Node & Put in the data
        Node new_node = new Node(new_data);
  
        // 3. Make next of new Node as head
        new_node.next = head;
  
        // 4. Move the head to point to new Node
        head = new_node;
    }
    
    
	public static void main(String[] args) {

		Solution llist = new Solution();
		 
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
         
        // Traversing LinkedList
        //System.out.println(llist.head.next.next.next.data);
        
        
        // Create loop for testing
        llist.head.next.next.next.next = llist.head;
 
        System.out.println("Loop found :: " + llist.hasCycle(llist.head));
        
	}

}

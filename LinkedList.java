package org.example;


// Java program to implement
// a Singly Linked List
public class LinkedList {

    Node head; // head of list

    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public void insert(int data) {
        // Create a new node with given data
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
        } else {

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }
    }
    public void add(int data){
        Node newnode1 = new Node(data);
        if(head==null){
            head=newnode1;
        }
        else{
            Node last = head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newnode1;
        }
    }


    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    public void display(){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.add(22);
        list.display();


        // Print the LinkedList
//        printList(list);
    }
}

package com.bridgelabz;

import org.w3c.dom.Node;

public class LinkedList {
    Node head;
    class Node{
        String data;
        Node next;

        Node (String data){
            this.data=data;
            this.next=null;
        }
    }
    //data adding in first position
    public void add(String data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
    }
    //adding data to last ..
    public void addLast(String data){
        Node newNode= new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        Node tempNode= head;
        while(tempNode.next !=null){
            tempNode=tempNode.next;
        }
        tempNode.next=newNode;
    }
    //printing linked list..
    public void printNode(){
        if(head==null){
            System.out.println("Linked list is empty:");
        return;
        }
        Node tempNode=head;
        while (tempNode!=null){
            System.out.println("=> " +tempNode.data);
            tempNode=tempNode.next;
        }
        System.out.println("null");
    }
    //size counting
    public int size(){
        int count= 0;
        Node temp = head;
        while (temp !=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    // insert the data bet^n
    public void insertIndex(int userIndex, String data) {
        LinkedList obj1 = new LinkedList();

        // User  insert a first position
        if (userIndex == 0)
            obj1.add(data);

            // User insert a last position
        else if (userIndex == size())
            obj1.addLast(data);

            // User insert invalid position
        else if (userIndex < 0 || userIndex >= size())
            System.out.println("Invalid index");

            // User insert specific index
        else {
            // Creating New Node
            Node newNode = new Node(data);

            //  track traversing
            int index = 0;

            // Pointers track left & right side elements
            Node left = head;
            Node right = left.next;

            // Traverse or Move till last element before user entered index
            while (index < userIndex - 1) {
                left = left.next;
                right = right.next;
                index++;
            }
            // Connecting new Node with right side elements
            newNode.next = right;

            // Connecting left side elements with new Node
            left.next = newNode;
        }
    }
    // Delete first element
    public void deleteFirst(){
        if(head == null){
            System.out.println(" the list is empty");
            return;
        }
        head = head.next;
    }
    // delete last element
    public void deleteLast(){
        if(head == null){
            System.out.println(" the list is empty");
            return;
        }
        if(head.next == null){
            head= null;
            return;
        }
        Node secoundLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secoundLast = secoundLast.next;
        }
        secoundLast.next= null;
    }
    // search element
    public void Search(String Data1) {
        if (head == null) {                                  // Checking f head  empty or not
            System.out.println("Linked list is empty...");
            return;
        }
        int check = 0;
        Node tempNode = head;
        while (tempNode != null) {
            check++;
            if (tempNode.data == Data1) {
                System.out.println("data present  " + tempNode.data + " at " + check);
                break;
            }else {
                tempNode = tempNode.next;
            }
        }
        if (tempNode == null){
            System.out.println(" THe data is not present");
        }
    }


    public static void main(String[] args) {
        System.out.println("----Welcome to the linked list program-----");
    LinkedList obj= new LinkedList();

    obj.add("56");
    obj.add("30");
    obj.add("70");
    obj.insertIndex(2,"secondIndex:");
    obj.deleteFirst();
    obj.deleteLast();
    obj.Search("30");
    obj.printNode();
    }
}


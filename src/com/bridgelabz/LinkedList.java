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
    public static void main(String[] args) {
        System.out.println("----Welcome to the linked list program-----");
    LinkedList obj= new LinkedList();

    obj.add("70");
    obj.add("30");
    obj.add("56");
    obj.printNode();
    }

}


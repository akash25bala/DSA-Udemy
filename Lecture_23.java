package Lecture_23;

import Lecture_22.Lecture_22;

public class Lecture_23 {
    Node head;
    Node tail;
    int length;
    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    public void append(int value) {
       Node newNode = new Node(value);
       length = 0;
       if(head == null){
           head = newNode;
           tail = newNode;
       }
       else{
           tail.next = newNode;
            tail = newNode;
       }
       length++;
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

package Lecture_27;


import Lecture_23.Lecture_23;
import Lecture_26.Lecture_26;

public class RemoveFirst {
    int length;
    Node head = null;
    Node tail = null;

    public Node RemoveFirst() {
        if(length==0){
            return null;
        }
        head = head.next;
        length--;

     return head;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
            length++;
            return;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    class Node{
        int value;
       Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    public void printList(){
    Node temp = head;
        while (temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
//        System.out.println(head.value);
//        System.out.println(tail.value);
//        System.out.println(length);
    }
}

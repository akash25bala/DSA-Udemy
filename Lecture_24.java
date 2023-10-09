package Lecture_24;

import Lecture_22.Lecture_22;
import Lecture_23.Lecture_23;

public class Lecture_24 {
Node head;
Node tail;
int length;

//    public int getHead() {
//        return head.value;
//    }
//
//    public int getTail() {
//        return tail.value;
//    }
//
//    public int getLength() {
//        return length;
//    }

    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    public void append(int value) {
     Node newNode = new Node(value);
        if(head ==null){
            head = newNode;
            tail = newNode;
            length++;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            length++;
        }

    }
    public Node removeLast(){

        if(length==0){
            return null;
        }
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next=null;
        length--;
        if(length==0){
            head = null;
            tail = null;
        }
        return temp;

//        if(length==0){
//            System.out.print("LL is null");
//        }
//        else {
//          while(temp.next.next!=null){
//              temp = temp.next;
//          }
//          tail = temp;
//          tail.next = null;
//        }

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

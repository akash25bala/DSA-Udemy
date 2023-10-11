package Lecture_30;

import Lecture_24.Lecture_24;
import Lecture_26.Lecture_26;
import Lecture_29.SetElement;

public class InsertElement {
    Node head;
    Node tail;
    int length;
    /*
    creating a Node
     */
    class Node{
        int value;
     Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    /*
    to insert values in LL
     */
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
/*
Insert value at any index.
 */
    public boolean InsertValue(int index,int value ){
      Node newNode = new Node(value);
      Node temp;
        Lecture_26 prepend = new Lecture_26();
        if(index==0){                               // WHEN WE PUT VALUE AT FIRST POSITION
            temp = head;
       head = newNode;
       newNode.next = temp;
       length++;
          return true;
        }
        else if(index == length){                   // WHEN WE PT VALUE AT LAST POSITION
            tail.next = newNode;
            tail = newNode;
            length++;
        }
        else {
            temp = head;
           Node temp2 = temp;
           int i =0;
           while(i < index){
               temp2 = temp;
               temp = temp.next;i++;
           }
           temp2.next = newNode;
           newNode.next = temp;
           length++;
           return true;
        }
return false;
    }
    /*
    to print list
    */
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.print(length);
    }
}

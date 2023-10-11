package Lecture_31;

import Lecture_24.Lecture_24;
import Lecture_29.SetElement;

public class RemoveElement {
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
    public boolean removeElement(int index){
        if (index<0 || index>length){
            return false;
        }
        else {int i=0;
           Node temp = head;
           Node temp2 = temp;
            while(i < index){
                temp2 = temp;
                temp = temp.next;
                i++;
            }
            temp2.next = temp.next;
            length--;
            return true;

        }
    }


    public void printList(){
       Node temp = head;
        while (temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
}

package Lecture_29;

import Lecture_27.RemoveFirst;
import Lecture_28.GetElement;

public class SetElement {
    int length;
    Node head;
    Node tail;
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

    public boolean setElement(int index,int newValue) {
      Node newNode = new Node(newValue);
        if(length<=0||length<index){
            return false;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }

   newNode.next = temp.next;
       temp.value = newNode.value;
        return true;

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
        System.out.print("NULL");
    }

}

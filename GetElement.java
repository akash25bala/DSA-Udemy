package Lecture_28;

import Lecture_23.Lecture_23;

public class GetElement {
    int length;
    Node head;
    Node tail;



    class Node{
        int value;
     Node next;

        public Node(int value) {
            this.value = value;
        }
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
    public Node GetElement(int index) {
if(length < 0 || index >= length){
    return null;
}
Node temp = head;
for(int i =0;i<index;i++){
    temp = temp.next;
}
return temp;
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

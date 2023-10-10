package Lecture_20;

public class Lecture_20 {
    Node head;
    Node tail;
    int length;

    public Lecture_20(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        System.out.print(head.value);
    }
public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
}
    public class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
}

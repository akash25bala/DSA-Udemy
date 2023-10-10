package Lecture_22;
public class Lecture_22 {
    Node head;
public void printList(){
Node temp = head;
    while (temp != null){
        System.out.print(temp.value);
    }
}
class Node{
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}
}

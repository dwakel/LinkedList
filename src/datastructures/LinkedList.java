package datastructures;

public class LinkedList {

    Node head;
    public static LinkedList insert(LinkedList list, int data)
    {
        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null){
            list.head = newNode;
        }
        else{
            Node lastNode = list.head;
            while (lastNode.next != null)
                lastNode = lastNode.next;
            lastNode.next = newNode;
        }
        return list;
    }

    public static void printLinkedList(LinkedList list){
        Node current = list.head;
        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args)
    {

    }
}

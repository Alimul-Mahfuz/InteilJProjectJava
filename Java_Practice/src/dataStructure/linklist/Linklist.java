package dataStructure.linklist;

class Node{
    int data;
    Node next;
}

public class Linklist {
    Node head;
    void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head==null){
            head=node;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=node;
        }
    }

    void insertFirst(int data){
        Node node = new Node();
        node.data= data;
        node.next=null;
        node.next = head;
        head=node;
    }

    void insertAfter(int data,int aftdata){
        Node temp = head;
        while(temp.data!=aftdata){
            temp = temp.next;
        }
        Node node = new Node();
        node.data=data;
        node.next=temp.next;
        temp.next= node;

    }

    void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.insert(50);
        list.insert(60);
        list.insert(67);
        list.insertFirst(6);
        list.insertAfter(72,60);
        list.display();
    }

}



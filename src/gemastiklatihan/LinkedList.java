/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class LinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head = new Node(4);
    Node nodeB = new Node(2);
    Node nodeC = new Node(3);
    Node nodeD = new Node(10);
    
    public LinkedList() {
        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
    }
    
    static int countNodes(Node current) {
        if (current == null) {
            return 0;
        }
        
        return 1 + countNodes(current.next);
    }
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        int countNodes = countNodes(LL.head);
        System.out.println("jumlah node : " + countNodes);
    }
}

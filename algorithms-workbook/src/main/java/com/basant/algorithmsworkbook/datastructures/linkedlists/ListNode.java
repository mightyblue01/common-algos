package com.basant.algorithmsworkbook.datastructures.linkedlists;

public class ListNode {
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }

    public void addNode(ListNode rootNode, int data){

        if(rootNode==null){
            rootNode=new ListNode(data);
        }
        else if(rootNode.next==null)
                rootNode.next=new ListNode(data);
        else
            addNode(rootNode.next,data);
    }

    public void printList(ListNode rootNode){

        ListNode temp=rootNode;

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

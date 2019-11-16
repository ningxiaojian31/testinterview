package cn.zdxh.testinterview.linked;

public class LinkedList {

    private Node head; //头节点

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    //链表最后插入节点
    public Node append(Node node){
       return head.append(node);
    }

    //遍历链表
    public void print(Node head){
       head.print(head);
    }

    //插入节点到具体位置
    public Node insert(Node node,int index){
        return head.insert(node,index);
    }

    //删除具体位置的节点
    public Node delete(int index){
        return head.delete(index);
    }

}

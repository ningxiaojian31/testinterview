package cn.zdxh.testinterview.linked;

public class LinkedListTest {
    public static void main(String[] args) {
        //创建链表
        LinkedList linkedList = new LinkedList();
        //创建头节点
        Node head = new Node();
        linkedList.setHead(head);
        //创建其他节点
        linkedList.append(new Node(2)).append(new Node(3)).append(new Node(4));
        linkedList.print(head);
        //插入节点到指定位置
        System.out.println("\n========================");
        linkedList.insert(new Node(8),1);
        linkedList.print(head);
        //删除指定位置节点
        System.out.println("\n========================");
        linkedList.delete(3);
        linkedList.print(head);


    }
}

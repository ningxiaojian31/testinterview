package cn.zdxh.testinterview.linked;

public class Node {

    private int data;//节点值
    private Node next;//下一个节点

    public Node() {}

    public Node(int data) {
        this.data = data;
    }

    /**
     * 链表最后插入节点
     * @param node
     * @return
     */
   public Node append(Node node){
        Node lastNode = this;
        //找到最后一个节点
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }
        //赋值给最后一个节点
       lastNode.next = node;
        return this;
   }

    /**
     * 遍历链表
     * @param head
     */
    public void print(Node head){
//        if (head != null){
//            System.out.println(head.data);
//            head = head.next;
//            print(head);
//        }
        while (head != null){
            System.out.print(head.data);
            head = head.next;
        }
    }

    /**
     * 插入节点到具体位置
     * @param node
     * @return
     */
    public Node insert(Node node,int index){
        Node currentNode = this;
        int count = 1;
        while (count != index){
            currentNode = currentNode.next;
            count++;
        }
        node.next = currentNode.next;
        currentNode.next = node;
        return this;
    }

    /**
     * 删除具体位置的节点
     * @param index
     * @return
     */
    public Node delete(int index){
        Node currentNode = this;
        int count = 1;
        while (count != index){
            currentNode = currentNode.next;
            count ++;
        }
        currentNode.next = currentNode.next.next;
        return this;
    }
}

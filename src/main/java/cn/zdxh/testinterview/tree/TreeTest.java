package cn.zdxh.testinterview.tree;

public class TreeTest {
    public static void main(String[] args) {
        //创建空子树
        Tree tree = new Tree();
        //创建根节点
        Node root = new Node(1);
        tree.setRoot(root);
        //创建左子树
        Node lNode = new Node(2);
        root.setLeft(lNode);
        lNode.setLeft(new Node(4));
        lNode.setRight(new Node(5));
        //创建右子树
        Node rNode = new Node(3);
        root.setRight(rNode);
        rNode.setLeft(new Node(6));
        rNode.setRight(new Node(7));
        //前序遍历
        System.out.println("前序遍历：");
        tree.preShow(root);
        //中序遍历
        System.out.println("\n中序遍历：");
        tree.midShow(root);
        //后序遍历
        System.out.println("\n后序遍历：");
        tree.postShow(root);
        //查找节点
        Node resultNode = tree.preSearch(8);
        System.out.println("\n查找结果："+resultNode);
        tree.deleteNode(5);
        //前序遍历
        System.out.println("前序遍历：");
        tree.preShow(root);
        System.out.println("\n=============");
        System.out.println(tree.getHeight(root));
        System.out.println("=============");
        System.out.println(tree.getSize(root));
        //动态创建搜索二叉树
        Tree tree2 = new Tree();
        int[] datas = {1,9,10,5,7,8};
        Node root2 = new Node(3);
        tree2.setRoot(root2);
        for (int i = 0;i < datas.length;i++){
            tree2.createSearchTree(root2,datas[i]);
        }
        System.out.println("\n==============");
        tree2.preShow(root2);
        System.out.println("\n==============");
        System.out.println(tree2.getHeight(root2));
    }
}

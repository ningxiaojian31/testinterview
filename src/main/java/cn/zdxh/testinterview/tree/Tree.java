package cn.zdxh.testinterview.tree;

/**
 * 实现二叉树
 */
public class Tree {

    private Node root;


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    //前序遍历
    public void preShow(Node node){
        root.preShow(node);
    }

    //中序遍历
    public void midShow(Node node){
        root.midShow(node);
    }

    //后序遍历
    public void postShow(Node node){
        root.postShow(node);
    }

    //前序查找
    public Node preSearch(int value){
        return root.preSearch(value);
    }

    //删除子节点（以及子树）
    public void deleteNode(int value){
       root.deleteNode(value);
    }

    //获得树的高度
    public int getHeight(Node node){
        return root.getHeight(node);
    }

    //获得树的大小
    public int getSize(Node node){
        return root.getSize(node);
    }

    //创建二叉查找树
    public Node createSearchTree(Node root,int value){
       return root.createSearchTree(root,value);
    }


}

package cn.zdxh.testinterview.tree;

public class Node {

    private int data; //节点值
    private Node left; //左子树
    private Node right; //右子树

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }



    /**
     * 先序遍历
     * @param node
     */
    public void preShow(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.data+",");
        if (node.left != null){
            preShow(node.left);
        }
        if (node.right != null){
            preShow(node.right);
        }

    }

    /**
     * 中序遍历
     * @param node
     */
    public void midShow(Node node){
        if (node == null){
            return;
        }
        if (node.left != null){
            midShow(node.left);
        }
        System.out.print(node.data+",");
        if (node.right != null){
            midShow(node.right);
        }

    }

    /**
     * 后序遍历
     * @param node
     */
    public void postShow(Node node) {
        if (node == null){
            return;
        }
        if (node.left != null){
            postShow(node.left);
        }
        if (node.right != null){
            postShow(node.right);
        }
        System.out.print(node.data+",");
    }

    /**
     * 前序查找
     * @param value
     * @return
     */
    public Node preSearch(int value){
        Node node = null;
        if (data == value){
            return new Node(value);
        }else {
            //查找左节点
            if (left != null){
                node = left.preSearch(value);
            }

            if (node != null){
                return node;
            }
            //查找右节点
            if (right != null){
                node = right.preSearch(value);
            }
        }
        return node;
    }

    /**
     * 删除子节点（以及子树）
     * @param value
     */
    public void deleteNode(int value){
        Node parent = this;
       if (parent.left != null && parent.left.data == value){
           parent.left = null;
           return;
       }
        if (parent.right != null && parent.right.data == value){
            parent.right = null;
            return;
        }
       parent = left;
       if (parent != null){
           parent.deleteNode(value);
       }
       parent = right;
       if (parent != null){
           parent.deleteNode(value);
       }
    }

    /**
     * 获得树的高度
     * @param node
     * @return
     */
    public int getHeight(Node node){
        if (node == null){
            return 0;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        if (leftHeight > rightHeight){
            return leftHeight + 1;
        }else {
            return rightHeight +1;
        }
    }

    /**
     * 获得树的大小
     * @param node
     * @return
     */
    public int getSize(Node node){
        if (node == null){
            return 0;
        }
        int leftSize = getSize(node.left);
        int rightSize = getSize(node.right);
        return leftSize + rightSize + 1;
    }

    /**
     * 创建二叉查找树
     * @param value
     * @return
     */
    public Node createSearchTree(Node root,int value){
        Node node = this;
        if (root == null){
            root = new Node(value);
            return root;
        }
        int currentValue = node.data;
        if (value > currentValue){
            if (node.right == null){
                node.right = new Node(value);
            }else {
                node.right.createSearchTree(root,value);
            }

        }else {
            if (node.left == null){
                node.left = new Node(value);
            }else {
                node.left.createSearchTree(root,value);
            }

        }
        return root;
    }
}

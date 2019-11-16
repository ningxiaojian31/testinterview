package cn.zdxh.testinterview.stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        //进栈
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println("======================");
        myStack.show();
        //出栈，删除栈顶元素
        myStack.pop();
        myStack.pop();
        System.out.println("\n======================");
        myStack.show();
        //出栈，不删除栈顶元素
        System.out.println("\n======================");
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
    }
}

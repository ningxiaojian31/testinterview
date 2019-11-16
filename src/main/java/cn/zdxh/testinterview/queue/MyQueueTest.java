package cn.zdxh.testinterview.queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        //入队
        myQueue.add(5);
        myQueue.add(6);
        myQueue.add(7);
        myQueue.add(8);
        System.out.println("===============");
        myQueue.show();
        System.out.println("\n===============");
        System.out.print(myQueue.peek());
        System.out.println("\n===============");
        myQueue.poll();
        myQueue.poll();
        myQueue.show();
    }
}

package cn.zdxh.testinterview.queue;

/**
 * 队列
 */
public class MyQueue {

    private int[] datas;

    public MyQueue() {
        this.datas = new int[0];
    }

    public MyQueue(int[] datas) {
        this.datas = datas;
    }

    /**
     * 入队
     * @param value
     */
    public void add(int value){
        int[] newDatas = new int[datas.length + 1];
        for (int i = 0;i < datas.length;i++){
            newDatas[i] = datas[i];
        }
        newDatas[datas.length] = value;
        datas = newDatas;
    }

    /**
     * 出队，删除队头元素
     * @return
     */
    public int poll(){
        int value = datas[0];
        int[] newDatas = new int[datas.length - 1];
        for (int i = 0;i < datas.length - 1;i++){
            newDatas[i] = datas[i + 1];
        }
        datas = newDatas;
        return value;
    }

    /**
     * 出队，不删除队头元素
     * @return
     */
    public int peek(){
        return datas[0];
    }

    /**
     * 显示所有的队列元素
     */
    public void show(){
        for(int i = 0;i < datas.length;i++){
            System.out.print(datas[i] + " ");
        }
    }
}

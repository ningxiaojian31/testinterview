package cn.zdxh.testinterview.stack;

/**
 * 栈
 */
public class MyStack {

    private int[] datas;

    public MyStack() {
        this.datas = new int[0];
    }

    public MyStack(int[] datas) {
        this.datas = datas;
    }

    /**
     * 入栈
     * @param value
     */
    public void push(int value){
        //创建新数组
        int[] newDatas = new int[datas.length + 1];
        //复制旧数组（k-1）数据到新数组
        for (int i = 0;i < datas.length ;i++){
            newDatas[i] = datas[i];
        }
        //添加新数据
        newDatas[datas.length] = value;
        //新数组替换旧数组
        datas = newDatas;
    }

    /**
     * 出栈，取栈顶元素，并删除栈顶元素
     */
    public int pop(){
        int value = datas[datas.length - 1];
        //创建新数组
        int[] newDatas = new int[datas.length - 1];
        //复制旧数组（k-1）数据到新数组
        for (int i = 0;i < datas.length - 1;i++){
            newDatas[i] = datas[i];
        }
        //新数组替换旧数组
        datas = newDatas;
        return value;
    }

    /**
     * 出栈，取栈顶元素，但不删除栈顶元素
     * @return
     */
    public int peek(){
        return datas[datas.length - 1];
    }

    /**
     * 遍历栈内元素
     */
    public void show(){
        for (int i = 0;i < datas.length;i++){
            System.out.print(datas[i]+" ");
        }
    }
}

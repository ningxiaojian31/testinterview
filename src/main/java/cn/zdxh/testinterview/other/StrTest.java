package cn.zdxh.testinterview.other;

import java.util.*;

public class StrTest {
    public static List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < A.length;i++){
            char[] datas = A[i].toCharArray();
            for(int j = 0;j < datas.length;j++){
                if(map.get(datas[j]) != null){
                    Integer data = map.get(datas[j]);
                    data = data +1;
                    map.put(datas[j],data);
                }else{
                    map.put(datas[j],1);
                }
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() >= A.length){
                list.add(entry.getKey().toString());
            }
        }
        return list;
    }
    public static void main(String[] args) {

    }
}

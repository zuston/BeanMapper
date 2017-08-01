package com.ctrip.tour.WeakHashmap;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.WeakHashMap;

/**
 * Created by zhang_jf on 2017/7/26.
 */
public class WeakHm {
    public static void main(String[] args) {
        WeakHashMap<Object,Object> w= new WeakHashMap();
        //三个key-value中的key 都是匿名对象，没有强引用指向该实际对象
        //增加一个字符串的强引用
        System.out.println(w);
        //通知垃圾回收机制来进行回收
        System.gc();
        System.runFinalization();
        //再次输出w
        System.out.println("第二次输出:"+w);
    }
}

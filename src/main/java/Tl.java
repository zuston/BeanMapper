import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhang_jf on 2017/8/7.
 */
public class Tl {
    public static InheritableThreadLocal<String> tf = new InheritableThreadLocal<>();
    public static ExecutorService cachedThreadPool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
//        tf.set("hello world");
//        for (int i=0;i<100;i++){
//            cachedThreadPool.execute(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        Thread.sleep(1000);
//                        System.out.println("::"+tf.get());
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }
//        cachedThreadPool.shutdown();
//
//        System.out.println(":::::::::::::::::::::::::::::::::::::");
//
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(tf.get());
//            }
//        });
//        thread.start();


        TreeMap treeMap = new TreeMap();
        treeMap.put("key","v");
        treeMap.put("kkk","v");

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("h","v");
        linkedHashMap.put("e","b");
    }
}

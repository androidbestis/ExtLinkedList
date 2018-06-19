import com.adonai.extLinkedList.ExtLinkedList;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    /*List<String> list = new ArrayList<String>();
      list.add("aa");
      list.add("bb");

      System.out.println("初始化前: "+ list);

       //实现 unmodifiable
       //不可修改的集合
      //List<String> immutablelist = Collections.unmodifiableList(list);
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        //修改 list
       unmodifiableList.add("zz");*/

        ExtLinkedList<String> extLinkedList = new ExtLinkedList();
        extLinkedList.add("ee");
        extLinkedList.add("tt");
        extLinkedList.add("oo");

       /* System.out.println(extLinkedList.first.object);
        System.out.println(extLinkedList.first.next.object);
        System.out.println(extLinkedList.first.next.next.object);*/


        extLinkedList.remove(1);
        System.out.println(extLinkedList.getSize());
        List<String> allNode = extLinkedList.getAll();
        for (String node: allNode) {
            System.out.println(node);
        }

        /*System.out.println(extLinkedList.get(0));
        System.out.println(extLinkedList.get(1));
        System.out.println(extLinkedList.get(2));*/
    }
}

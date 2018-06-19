package com.adonai.extLinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * 手写LinkedList
 * @author lixudong
 */
public class ExtLinkedList<E> {

    int size;
    Node first;
    Node last;

    /**
     * 添加方法
     * @param e
     */
   public void add(E e){
       Node curNode = new Node();
         //添加第一个节点
       if(first == null){
          //赋值
          curNode.object = e;
          first = curNode;
          last = curNode;
       }else{
         //添加第二个或多个节点
         //赋值
           curNode.object = e;
           curNode.prev =  last;
           last.next = curNode;
           last = curNode;
       }
       size++;
   }

    private void checkElementIndex(int var1) {
        if (!this.isElementIndex(var1)) {
            throw new IndexOutOfBoundsException("index out of range");
        }
    }

    private boolean isElementIndex(int var1) {
        return var1 >= 0 && var1 < this.size;
    }

   /**
    *查询方法
    */
   public Object get(Integer index){
     //检验index下标
     checkElementIndex(index);
     Node node = null;
     //判断第一个节点
     if(first != null){
         node = first;
         for(int i=0;i<index;i++){
             node =  node.next;
         }
     }
     return node.object;
   }

    /**
     * 获取当前节点
     * @param index
     * @return
     */
    public Node getCur(Integer index){
        //检验index下标
        checkElementIndex(index);
        Node node = null;
        //判断第一个节点
        if(first != null){
            node = first;
            for(int i=0;i<index;i++){
                node =  node.next;
            }
        }
        return node;
    }


    /**
     * 查询所有LinkedList数据方法
     */
   public List<String> getAll(){
       List<String> list = new ArrayList<String>();
     //遍历所有的节点获取Object值
     for(int i =0;i<size;i++){
         String nodestr = (String)get(i);
         list.add(nodestr);
     }
    return list;
   }

    /**
     * 删除方法
     */
   public void remove(Integer index){
     //检验下标
     checkElementIndex(index);
     //获取当前节点
     Node preNode = getCur(index-1);
     Node nextNode = getCur(index+1);
     //1.当前节点的 上一个节点 的下一个节点变为当前节点的下一个节点
     preNode.next = nextNode;
     //2.当前节点的 下一个节点 的上一个节点为当前节点的上一个节点
     nextNode.prev = preNode;
     size--;
   }

    /**
     * 获取所有的节点数量
     * @return
     */
   public Integer getSize(){
       return size;
   }


   class Node{
        Object object;
        Node prev;
        Node next;
   }
}

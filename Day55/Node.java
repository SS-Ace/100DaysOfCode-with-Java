package LinkList;

public class Node<T>{
    public T data;
    public Node<T> next;
    
    Node(T d) {
      data = d;
      next = null;
    }
 }
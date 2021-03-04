interface  MyStack<T> {
  public void push(T data);
  public T pop();
  public T peek();
  public boolean isEmpty();
}
class StackByLinkedList<T>implements MyStack<T>

{
Node<T> top;
  public StackByLinkedList() {
    this.top = null;
  }
  @Override
  public void push(T data) {
    Node n1 = new Node(data);
    n1.next = top;
      top = n1;

    }
  @Override
  // deletion operation
  public T pop() {
    T result= null;
    if (isEmpty()) {
      return result;
    } else {
      result = top.data;
      top= top.next;
      return result;
    }
  }
  @Override
  public T peek() {
    T result= null;
    if (isEmpty()) {
      return result;
    } else {
      result = top.data;
     // top= top.next;
      return result;
    }
  }

  @Override
  public boolean isEmpty() {
    return(top == null);
  }
  public void traverse()
  {
    Node temp = top;
    while (temp!= null)
    {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}


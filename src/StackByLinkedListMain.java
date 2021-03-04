public class StackByLinkedListMain {
  public static void main(String[] args) {
    StackByLinkedList<Employee> obj= new StackByLinkedList<Employee>();
    Employee obj1 = new Employee(101,"neeraj", 20000);
    Employee obj2 = new Employee(102,"ajay", 30000);
    Employee obj3 = new Employee(103,"kamal", 40000);
    obj.push(obj1);
    obj.push(obj2);
    obj.push(obj3);
    System.out.println(obj.peek());
    obj.traverse();  
  }
}

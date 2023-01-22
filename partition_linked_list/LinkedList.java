package partition_linked_list;

class LinkedList<T extends Comparable<T>> {
  private Node<T> head = null;
  private Node<T> tail = null;
  private int size = 0;

  class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> prev, next;

    public Node (T data) {
      this.data = data;
    }
    // @Override
    // public String toString() {
    //   return data;
    // }
  }

  //Partition the linked list on a value such that all values (unordered) that
  //are less than the value are placed before the values that are greater
  // or equal to the value.

  public void partition(T partition) {
    // trav1 tracks the next value that should be swapped if there is a value that
    // is less than the partition to the right.
    Node<T> trav1 = head;
    Node<T> trav2 = head.next;

    while (trav2 != null) {
      if (trav1.data.compareTo(partition) < 0)
        trav1 = trav1.next;

      if (trav2.data.compareTo(partition) < 0) {
        T tmp = trav1.data;
        trav1.data = trav2.data;
        trav2.data = tmp;
      }
      trav2 = trav2.next;
    }
  }

  public void add(T val) {
    Node<T> n = new Node<>(val);
    if (head == null) {
      tail = head = n;
    } else {
      tail.next = n;
      n.prev = tail;
      tail = n;
    }
    size++;
  }

  @Override
  public String toString() {
    if (size == 0) return "";

    StringBuilder sb = new StringBuilder();
    sb.append("[");
    Node<T> trav = head;
    while (trav != null) {
      sb.append(trav.data);
      if (trav.next != null) sb.append(", ");
      trav = trav.next;
    }
    sb.append("]");
    return sb.toString();
  }
}

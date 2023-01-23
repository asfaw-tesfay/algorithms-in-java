package partition_linked_list;

class Main {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();

    ll.add(4); ll.add(6);  ll.add(10); ll.add(7);
    ll.add(12); ll.add(4); ll.add(1);

    ll.addFirst(99);

    System.out.println(ll.toString());
    ll.partition(6);
    System.out.println(ll.toString());

    // Add two integers with each integer's digit represented as a node.
    LinkedList<Integer> ll1 = new LinkedList<>();
    LinkedList<Integer> ll2 = new LinkedList<>();
    ll1.add(9); ll1.add(6);
    ll2.add(7); ll2.add(8); ll2.add(4);

    LinkedList<Integer> sum = LinkedList.addInt(ll1, ll2);
    System.out.println(ll1.toString());
    System.out.println(ll2.toString());
    System.out.println(sum.toString());
  }
}

package partition_linked_list;

class Main {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();

    ll.add(4); ll.add(6);  ll.add(10); ll.add(7);
    ll.add(12); ll.add(4); ll.add(1);

    System.out.println(ll.toString());
    ll.partition(6);
    System.out.println(ll.toString());
  }
}

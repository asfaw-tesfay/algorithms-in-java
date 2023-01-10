package permutations;

import java.util.concurrent.TimeUnit;

class Main {
  public static void main(String[] args) {
    long time1 = System.nanoTime();
    boolean permutations = Strings.permutationsV1(args[0], args[1]);
    long elapsed = System.nanoTime() - time1;
    System.out.println("Are permutations of eachother? " + permutations);
    displayExecutionTime(elapsed);

    time1 = System.nanoTime();
    permutations = Strings.permutationsV2(args[0], args[1]);
    elapsed = System.nanoTime() - time1;
    System.out.println("Are permutations of eachother? " + permutations);
    displayExecutionTime(elapsed);

    time1 = System.nanoTime();
    permutations = Strings.permutationsV3(args[0], args[1]);
    elapsed = System.nanoTime() - time1;
    System.out.println("Are permutations of eachother? " + permutations);
    displayExecutionTime(elapsed);
  }

  static void displayExecutionTime(long elapsed) {
    System.out.println("Execution time: " + elapsed + " ns(" +
              TimeUnit.MILLISECONDS.convert(elapsed, TimeUnit.NANOSECONDS) + " ms)");
  }
}

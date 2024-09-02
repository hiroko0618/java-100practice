public class HeapSpace {
  public static void main (String[] args) {
    long total = Runtime.getRuntime().totalMemory();
    long free = Runtime.getRuntime().freeMemory();
    long max = Runtime.getRuntime().maxMemory();

    System.out.println(total);
    System.out.println(free);
    System.out.println(max);
  }
}

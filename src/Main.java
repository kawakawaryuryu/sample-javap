public class Main {
  public static void main(String... args) {
    Main main = new Main();
    int z = main.add(1, 2);
    System.out.println("result = " + z);
  }

  public int add(int x, int y) {
    return x + y;
  }
}

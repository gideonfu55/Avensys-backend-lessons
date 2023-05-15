public class sketch {
  public static void main(String[] args) {
    // StringBuffer s = new StringBuffer("Hello");
    // s.delete(0, 2);
    // System.out.println(s);
    // int x = 0;
    // assert (x > 0) : "assertion failed";
    // System.out.println("finished");

    // int array_variable [] = new int[10];
    // for (int i = 0; i < 10; i++) {
    //   array_variable[i] = i;
    //   System.out.print(array_variable[i] + " ");
    //   i++;
    // }
    int count = 1;
    while (count <= 15) {
      System.out.println(count % 2 == 1 ? "***" : "++++");
      count++;
    }
  }
}

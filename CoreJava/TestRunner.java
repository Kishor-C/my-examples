class Runner extends Thread {
 public static void main(String[ ] args) {
  Runner t = new Runner();
  t.setName("T1");
  t.run();
 }
 public void start() {
  for (int i = 0; i < 10; i++) {
   System.out.println("Value of i = "+ i);
  }
 }
}
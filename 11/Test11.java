class Test11 {
  // あえてぬるぽを起こすプログラム
  public static void main(String[] args) {
    String input = null;
    String result = null;
    int number;
    /*
      input.equals("hoge");
      ここで書いてもコンパイルは通ってしまう。起動した時点でぬるぽ発生
     */    

    System.out.println("（　´∀｀）＜ 整数を入れてね。0ならぬるぽ");
    input = new java.util.Scanner(System.in).nextLine();
    number = Integer.parseInt(input);

    if (number == 0) {
      System.out.println("\nｶﾞｯ");
      result.equals("hoge");
    } else {
      System.out.println("\n（　´∀｀）" + input + "だね");
      "hoge".equals(result);
    }

  }
}
class Ex1401 {
  public static void main(String[] args) {
    String input;

    System.out.print("3ずつ増やして表示します。\n最小値を入力してください > ");
    input = new java.util.Scanner(System.in).nextLine();
    int min = Integer.parseInt(input); // 以下のコメントアウト行の実装をする場合は、int number = ..としても良い。ただし可読性・保守性が犠牲になる

    System.out.print("最大値を入力してください > ");
    input = new java.util.Scanner(System.in).nextLine();
    int max = Integer.parseInt(input);

    /*
      int count;
      int number = min;
      for (count = 0 ; number <= max ; count++) {
        System.out.println(number);
        number += 3;
      }
    */
    // 上記の記述のほうが見やすいが、numberは再使用しないため変数のスコープを出来る限り狭くする方向とし、以下の記述とする

    int count = 0;
    for (int i = min ; i <= max ; i += 3) {
      System.out.println(i);
      count++;
    }

    System.out.println("----\n個数:" + count);
  }
}
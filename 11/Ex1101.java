class Ex1101 {
  public static void main(String[] args) {
    String input;
    int score;
    boolean validInput = false;
    String result;

    System.out.print("テストの点数を入力してください > ");
    input = new java.util.Scanner(System.in).nextLine();
    score = Integer.parseInt(input);

    if (score < 60) {
      // while文は独自追加
      while (!validInput) {
        System.out.print("\n補修授業を受けましたか(yes / no) > ");
        input = new java.util.Scanner(System.in).nextLine();

        if (input.equals("yes") || input.equals("no")) {
          break;
        }
        System.out.println("\nyesかnoで入力してください");
      }
    }

    if (score >= 80) {
      result = "A";
    } else if (score >= 60) { // ここの条件式にscore < 80は不要。1個目の条件式がfalseの時点でsocre < 80は確定している
      result = "B";
    } else if ("yes".equals(input)) {
      result = "C";
    } else {
      result = "D";
    }

    System.out.println("\n結果:" + result + "評価");
  }
}

/*
  equalsについて
  variable.equals("hoge")と記述すると、variableがnullの時ぬるぽが起こる
  "hoge".equals(variable)とすると引数がnullになることはあるがぬるぽは起こらない。ChatGPTいわく実務ではこの書き方のほうが良いらしい
  18行目は前者、29行目は後者で記述した
*/

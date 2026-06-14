class Ex0901 {
  public static void main(String[] args) {
    String[] subName = { "A教科", "B教科"};
    int[] subScore = new int[2];

    System.out.print(subName[0] + "の得点を入力してください > ");
    subScore[0] = Integer.parseInt(new java.util.Scanner(System.in).nextLine());

    System.out.print(subName[1] + "の得点を入力してください > ");
    subScore[1] = Integer.parseInt(new java.util.Scanner(System.in).nextLine());

    System.out.println(); // 空行
    System.out.println(subName[0] + ":" + subScore[0] + "点");
    System.out.println(subName[1] + ":" + subScore[1] + "点");
    System.out.println("----");
    // System.out.println("平均:" + ((subScore[0] + subScore[1]) / 2) + "点");
    System.out.println("平均:" + ((subScore[0] + subScore[1]) / 2.0) + "点"); // 問題文には指定がないが、double型で返すと小数点以下を表示できる
  }
}

/*
  new java.util.Scanner(System.in).nextLine()はScannerを1つだけ宣言して使い回すほうが一般的らしい(ChatGPTより)
  Scannerを宣言して、6-10行目をfor文でまとめるとスッキリしそう
*/
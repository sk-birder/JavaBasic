class Ex1201 {
  public static void main(String[] args) {
    System.out.print("1～13のいずれかを入力してください > ");
    String input = new java.util.Scanner(System.in).nextLine();
    int number = Integer.parseInt(input);

    String result;
    switch (number) {
      case 1:
        result = "A";
        break;
      case 11:
        result = "J";
        break;
      case 12:
        result = "Q";
        break;
      case 13:
        result = "K";
        break;
      default:
        result = String.valueOf(number); // result = "" + number; の方が簡単かも
    }

    System.out.println("\nカードは、" + result + "です。");
  }
}

/*
  4行目で整数を入力されたか確認する手段はChatGPTいわくtry-catchが一般的らしい。そのうちやってみよう。
*/
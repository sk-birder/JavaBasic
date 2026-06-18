class Ex1001 {
  public static void main(String[] args) {
    System.out.print("数値を入力してください > ");
    String input = new java.util.Scanner(System.in).nextLine();

    int number = Integer.parseInt(input);
    // if文の中にマジックナンバーを入れないためにminとmaxを宣言
    int min = 1;
    int max = 100;
    String result;

    if( (min <= number) && (number <= max) ) {
      result = "内";
    } else {
      result = "外";
    }

    System.out.println(number + "は" + min + "～" + max + "の範囲" + result + "です。");
  }
}

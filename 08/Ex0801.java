class Ex0801 {
  public static void main(String[] args) {
    double taxRate = 1.1;
    int price = 123;
    System.out.println("税込み金額:" + (int) (taxRate * price) + "円");
  }
}

/*
  キャスト演算子の優先度はとても高い(インクリメント演算子・デクリメント演算子の次)
  taxRate * priceをparenthesesで括らないと、1.1*123ではなく1*123になってしまい意図した動作にならない
  キャスト演算子は変数宣言とは異なり、行頭でなくても記述できる
*/
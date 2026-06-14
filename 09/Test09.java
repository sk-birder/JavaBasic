class Test09 {
  public static void main(String[] args) {
    int[] array = new int[3];
    // int[] array = new String[3];
    // 配列の宣言とnew演算子のデータ型は同一でなければならない。2行で宣言するよりは、1行で宣言すると事故が少なそう。
    for (int num = 0; num < 3; num++) {
      array[num] = 2 * num;
      System.out.println("インデックス" + num + "の内容は" + array[num]);
    }
    // for文のnum < 3をnum < 4にするとエラーになる、存在しない配列の要素を呼び出そうとするとエラーになるようだ。

    char[] charArray = new char[3];
    boolean[] booleanArray = new boolean[3];
    String[] strArray = new String[3];
    System.out.println(charArray[0]);     // 何も表示されない
    System.out.println(booleanArray[0]);  // false
    System.out.println(strArray[0]);      // null
  }
}
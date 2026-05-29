class Ex0401 {
  public static void main(String[] args) {
    System.out.print("こんにちは。sk-birderです。");
    System.out.println("埼玉県出身です。");
    System.out.println("好きな飲み物はコーヒーです。");
  }
}

/*
  public static void main(String[] args)について
  - public
    どこからでも呼び出し可能。実行時最初に呼び出すためpublicでないと実行できない。
    他にprivateやprotectedがある。Rubyと同様かも。
  - static
    インスタンス化しなくても使える。今はよくわからない。
    開始時点ではオブジェクトがないためstaticでないとならない。
    ちなみに、dynamicは無い。
  - void
    戻り値なし。開始時に読み込まれるメソッドに戻り値は要らないため記述。
    intと書くとintegerが戻り値になるらしい。
  - main(引数)
    mainはメソッド名。特殊な名前で、これでないと始められない。
  - String[]
    String型を配列で返しますよ、という意味？
  - args
    変数名。実は何でもいいが、慣習的にargsを使うことになっている。
  - Rubyで書くと
    def main(args)
    end
    に近いものになる
*/
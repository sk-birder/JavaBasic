class Ex0601 {
  public static void main(String[] args) {
    String name = "速水剛留";
    int month = 8;
    int day = 21;

    String introduction = name + "です。誕生日は" + month + "月" + day + "日です。";

    System.out.print(introduction);
  }
}

/*
  今更だがJavaは動的型付けではなく、厳格な型付けが必要
  使用頻度は高くないがlongやfloatはLやFが末尾に付くことに注意
  参照型の(プリミティブ型ではない)Stringは先頭大文字で宣言する
  参照型の正体はクラスらしいので、Javaの慣習においてクラス名はUpperCamelCaseなので、参照型は自ずと先頭大文字になるのかもしれない
*/
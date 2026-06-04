class Ex0701 {
  public static void main(String[] args) {
    int variable1 = 10;
    int variable2 = 3;

    System.out.println("変数1:" + variable1);
    System.out.println("変数2:" + variable2);
    System.out.println("割り算をした時の");
    System.out.println("商:" + (variable1 / variable2));   // parenthesesが無くても、連結演算子より乗除の優先度が高いため結果は同じ
    System.out.println("余り:" + (variable1 % variable2)); // 可読性を考えればあった方が良いと思う
  }
}
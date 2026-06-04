class Ex0702 {
  public static void main(String[] args) {
    int variable = 5;
    System.out.println("初期値:" + variable);

    variable++; //前置・後置どちらでも結果は同じ。ChatGPTの実務例によれば、後置で書くのが一般的なようだ
    System.out.println("1足すと:" + variable);

    variable -= 4;
    System.out.println("4引くと:" + variable);

    /*
      以下のように書くことも出来る。現場でこんなの書いたら怒られると思うけど
      System.out.println("1足すと:" + ++variable);
      System.out.println("4引くと:" + (variable -= 4));
    */
  }
}
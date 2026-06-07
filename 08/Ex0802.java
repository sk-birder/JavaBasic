class Ex0802 {
  public static void main(String[] args) {
    System.out.print("正の整数を入力してください >");
    String aStr = new java.util.Scanner(System.in).nextLine();
    int a = Integer.parseInt(aStr);

    System.out.print("正の整数を入力してください >");
    String bStr = new java.util.Scanner(System.in).nextLine();
    int b = Integer.parseInt(bStr);

    System.out.println("商:\t" + (a / b));   // parenthesesがなくても結果は同じ
    System.out.println("余り:\t" + (a % b)); // parenthesesがなくても結果は同じ
  }
}

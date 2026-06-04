class Ex0703 {
  public static void main(String[] args) {
    int price = 1500;
    boolean result = (price >= 1000) && (price <= 2000); //boolean型を宣言するときに同時に論理式を書いても良い。基本はif文でそのまま使う気がするけど
    System.out.print("結果:" + result);
  }
}
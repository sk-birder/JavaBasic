class Ex1301 {
  public static void main(String[] args) {
    int number = 100;
    while (number > 0) {
      System.out.println(number);
      number--;
    }
  }
}

/*
  1-100まで表示するため、条件式は(number >= 1)の方が正確かもしれない
  離散値(int)なので(number > 0)でも同じことではあるが…
*/
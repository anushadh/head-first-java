public class PhraseOMatic {
  public static void main(String[] args) {
    String[] one = {"I", "You", "We", "They"};
    String[] two = {"like", "love", "hate"};
    String[] three = {"singing", "dancing", "cooking", "reading"};

    int oneLength = one.length;
    int twoLength = two.length;
    int threeLength = three.length;

    int ran1 = (int) (Math.random() * oneLength);
    int ran2 = (int) (Math.random() * twoLength);
    int ran3 = (int) (Math.random() * threeLength);

    String phrase = "The phrase is:::: " + one[ran1] + " " + two[ran2] + " " + three[ran3];

    System.out.println(phrase);
  }
}

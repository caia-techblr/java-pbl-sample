import java.util.*;

class LengthComparator implements Comparator<String>
{
    public int compare(String s1, String s2)
    {
        return Integer.compare(s1.length(), s2.length());
    }
}
public class WordListDemo {
    public static void main(String args[]) {
      ArrayList<String> words;
      words=new ArrayList<String>();

      words.add("abcd");
      words.add("abcdxyz");
      words.add("xyz");
      words.add("hello");
      words.add("table");

      //Collections.sort(words, new LengthComparator());
      //Collections.reverse(words);

      Collections.sort(words,  new Comparator<Sting> () {
          public int compare(String s1, String s2)
          {
            return Integer.compare(s1.length(), s2.length());
          }
      });
      
      for(String w : words)
        System.out.println(w);
    }
}
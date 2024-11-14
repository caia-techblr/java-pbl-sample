import java.util.*;

class ValueComparator implements Comparator<Integer> {
   public int compare(Integer i1,Integer i2) {
     return i1.compareTo(i2);
   }
}
public class ArrayListDemo {
  public static void main(String args[]) {
    ArrayList<Integer> alist;
    alist=new ArrayList<Integer>();

    alist.add(10);  //boxing
    alist.add(36);  //alist.add(new Integer(10));
    alist.add(48);
    alist.add(24);
    alist.add(20);

    int sum = 0;
    for(Integer v : alist)
       sum += v;

    alist.forEach(  n -> { System.out.println("" + n); });

    Iterator<Integer> iter;
    iter = alist.iterator();
    while(iter.hasNext())
    {
      int x = iter.next();  //Unboxing
      sum += x;
    }

    alist.remove(3);
    alist.remove(Integer.valueOf(48));

    Collections.sort(alist);

    int mx = Collections.min(alist);
    int my = Collections.max(alist);

  }
    
}

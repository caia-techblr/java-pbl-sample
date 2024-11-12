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

    alist.add(10);  //alist.add(new Integer(10));
    alist.add(36);
    alist.add(48);
    alist.add(24);
    alist.add(20);

    alist.sort(new ValueComparator());
    //Collections.sort(alist);

    for(Integer x:alist)
       System.out.println(""+x);

    //alist.remove(3);
    //alist.remove(new Integer(36));

    Iterator<Integer> iter=alist.iterator();

    while(iter.hasNext()) {
      System.out.println(""+iter.next());    
    }    
  }
}

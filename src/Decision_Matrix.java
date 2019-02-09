package src;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
public class Decision_Matrix {
  public static void main(String[] args) {
    ArrayList<String> s = new ArrayList<String>();
    s.add("hi");
    s.add("yes");
    HashMap<Integer, String> h = getHashValue(s);
    System.out.println(s);
    System.out.print(h.toString());
  }

  public int Decision() {
    int decision = 0;

    switch (decision) {
      case 1:

      break;
      case 2:

      break;
      }
      return decision;
    }

  private static HashMap<Integer, String> getHashValue(ArrayList<String> list) {
    HashMap<Integer, String> hash = new HashMap<Integer, String>();
    Iterator<String> it = list.iterator();
    while(it.hasNext()){
      String str = it.next();
      Integer i = new Integer(str.hashCode());
      hash.put(i, str);
    }
    return hash;
  }

}

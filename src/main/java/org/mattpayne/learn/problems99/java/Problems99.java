package org.mattpayne.learn.problems99.java;

import java.util.List;


public class Problems99 {

  //  p1_FindLastElementOfList
  public static <T> T last(List<T> list) {
    return list.get(list.size() - 1);
  }

  public static <T> T penultimate(List<T> list) {
    //TODO(MGP): What if the size of the list is less than 2?
    return list.get(list.size() - 2);
  }

}

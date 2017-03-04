package org.mattpayne.learn.problems99.java;

import java.util.Arrays;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

import static org.mattpayne.learn.problems99.java.Problems99.last;
import static org.mattpayne.learn.problems99.java.Problems99.penultimate;


// Working through http://aperiodic.net/phil/scala/s-99/
public class Problems99Tests {

  @Test
  public void p1_FindLastElementOfList()
      throws Exception {
    assertThat(last(Arrays.asList(1, 1, 2, 3, 5, 8)), is(8));
  }

  @Test
  public void p2_FindLastButOneElementOfList()
      throws Exception {
    assertThat(penultimate(Arrays.asList(1, 1, 2, 3, 5, 8)), is(5));
  }

}

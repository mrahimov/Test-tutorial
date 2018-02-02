package com.example.murodjonrahimov.testingtutorial.util;

import org.assertj.core.api.Java6Assertions;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by murodjon.rahimov on 2/2/18.
 */
public class AdderTest {
  /** Giving */
  Adder adder;

  @Before
  public void setUp() {
    adder = new Adder();

  }
  @Test
  public void add_whenOneInputIsZero_shouldReturnOtherNumber() throws Exception {
    /** When */
    int result = adder.add(0, 7);

    /** Then */
    Java6Assertions.assertThat(result).isEqualTo(7); // need to import Java6Assertions

  }

  @Test
  public void add_whenInputIsNegative_shouldReturnNumber() throws Exception {
    /** When */
    int result = adder.add(-1, 7);

    /** Then */
    Java6Assertions.assertThat(result).isEqualTo(6);

  }

  @Test
  public void add_whenInputIzNotZeroAndNotNegative_shouldReturnNumber() throws Exception {
    /** When */
    int result = adder.add(1, 7);

    /** Then */
    Java6Assertions.assertThat(result).isEqualTo(8);

  }
}
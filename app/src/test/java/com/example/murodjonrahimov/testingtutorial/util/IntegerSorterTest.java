package com.example.murodjonrahimov.testingtutorial.util;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by murodjon.rahimov on 2/2/18.
 */
public class IntegerSorterTest {
  IntegerSorter integerSorter;

  @Before
  public void setUp() {
    integerSorter = new IntegerSorter();
  }

  @Test
  public void sort_whenEmpty_shouldReturnEmptyArray() throws Exception {
    int[] x = {};
    int[] result = integerSorter.sort(x);
    assertThat(result).isEmpty();
  }

  @Test
  public void sort_whenPositive_shouldReturnNumbersFromLowToHigh() throws Exception {
    int[] x = {9,8,4,6,5,7,1,3,2};
    int[] result = integerSorter.sort(x);
    assertThat(result).containsExactly(1,2,3,4,5,6,7,8,9);
  }

  @Test
  public void sort_whenRepeatingSmallValues_shouldReturnSortedNumbers() throws Exception {
    int[] x = {3,2,1,1,2,3,1,4,5,1};
    int[] result = integerSorter.sort(x);
    assertThat(result).containsExactly(1,1,1,1,2,2,3,3,4,5);
  }

  @Test
  public void sort_whenLargeNumbersCloseTogether_shouldReturnSortedArray() throws Exception {
    int[] x = {40_000_000, 40_000_400, 40_000_440, 40_000_444};
    int[] result = integerSorter.sort(x);
    assertThat(result).containsExactly(40_000_000, 40_000_400, 40_000_440, 40_000_444);
  }

  @Test
  public void sort_whenLargeNumbersCloseTogetherAndRepeating_shouldReturnSortedArray() throws Exception {
    int[] x = {40_000_000,
      40_000_444,
      40_000_440,
      40_000_400,
      40_000_444,
      40_000_400,
      40_000_400};
    int[] result = integerSorter.sort(x);
    assertThat(result).containsExactly(40_000_000,
      40_000_400,
      40_000_400,
      40_000_400,
      40_000_440,
      40_000_444,
      40_000_444);
  }

  @Test
  public void sort_whenLargestNegativeNumbersCloseTogether_shouldReturnSortedArray() throws Exception {
    int[] x = {-40_000_000,
      -40_000_444,
      -40_000_400,
      -40_000_440,
      -40_000_400,
      -40_000_400,
      -40_000_444};
    int[] result = integerSorter.sort(x);
    assertThat(result).containsExactly(-40_000_444,
      -40_000_444,
      -40_000_440,
      -40_000_400,
      -40_000_400,
      -40_000_400,
      -40_000_000);
  }

  @Test
  public void sort_whenNegativeSmallAndLargeNumbers_shouldReturnSortedArray() throws Exception {
    int[] x = {40_000_000,
      0,
      0,
      -30,
      3_000_999,
      -70_000_000,
      4,
      -30,
      0};
    int[] result = integerSorter.sort(x);
    assertThat(result).containsExactly(-70_000_000, -30, -30, 0, 0, 0, 4, 3_000_999, 40_000_000);
  }
}
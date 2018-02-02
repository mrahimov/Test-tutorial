package com.example.murodjonrahimov.testingtutorial.util;



/**
 * Created by murodjon.rahimov on 2/2/18.
 *
 * Return a sorted array of integers.
 *
 * @paraminput the unsorted input.
 * @return the sorted array.
 */

public class IntegerSorter {

  public static int[] sort(int[] input) {
    for (int i = 0; i < input.length; i++) {
      int tmp = 0;
      for (int j = i + 1; j < input.length; j++) {
        if (input[i] > input[j]) {
          tmp = input[i];
          input[i] = input[j];
          input[j] = tmp;
        }
      }
    }
    return input;
  }
}
//  Arrays.sort(input);
// Run test (IntegerSorterTest) and verify tests pass using Java's sort function
// Remove/Comment out the sort method
// Arrays.sort(input);
// Write your own sort algorithm and run the tests to verify your sort works




//  List<Integer> x =  new ArrayList<>();
//  int min = 0;
//  for (int i = 0; i < input.length; i++) {
//    min = input[i];
//    for (int j = input.length - 1; j >= 0; j--) {
//      if (min > input[j]) {
//        min = input[j-1];
//      } else {
//        min = input[i - 1];
//      }
//    }
//    x.add(min);
//  }
//  int[] n = new int[x.size()]; //(int[])x.toArray(int[x.size()]);
//  for (int i=0; i < n.length; i++)
//  {
//    n[i] = x.get(i).intValue();
//  }
//  return n;
//}

//imperfect number ordering algorithm
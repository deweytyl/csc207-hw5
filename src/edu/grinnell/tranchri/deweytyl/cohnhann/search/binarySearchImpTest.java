package edu.grinnell.tranchri.deweytyl.cohnhann.search;

import static org.junit.Assert.*;

import org.junit.Test;

public class binarySearchImpTest
{
  @Test
  public void test()
    throws Exception
  {
    // Make an array of length s and fill with even numbers
    // starting at 0.
    for (int s = 1; s < 32; s++)
      {
        // Make the array
        int[] arr = new int[s];

        for (int j = 0; j < s; j++)
          {
            arr[j] = j * 2;
          } // for every element in the array
        
        for (int i = 0; i < arr.length; i++)
          {
            // Make sure that every values 2*i is in the ith
            // position of the array.
            assert(binarySearchImp.binarySearch(i, arr, 0, arr.length - 1)
                   == i);
            
            // Search for an odd number which should not
            // exist and so an exception should be thrown
            try
            {
              binarySearchImp.binarySearch(2*i+1,arr, 0, arr.length - 1);
            } // try
            catch (Exception e)
            {
              // it caught an exception as expected
            } // catch
            
            // Search for -1 which should not exist and
            // so an exception should be thrown
            try
            {
              binarySearchImp.binarySearch(-1, arr, 0, arr.length - 1);
            } // try
            catch (Exception e)
            {
              // it caught an exception as expected
            } // catch
          } // for 
      } // for
  } // test()
} // binarySearchImpTest


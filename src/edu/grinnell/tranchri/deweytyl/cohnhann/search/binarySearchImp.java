package edu.grinnell.tranchri.deweytyl.cohnhann.search;

/**
 * binarySearchImp
 *      Implements binarySearch and includes a 
 *      midpoint method.
 */

public class binarySearchImp
{
  /**
   * Find the midpoint of two integers, rounds down if the
   * midpoint is not whole.
   * @param int a
   * @param int b
   * @return int mid
   */
  public static int midpoint(int a, int b)
  { 
    if (a % 2 != 0 && b % 2 != 0)
      {
        return (a / 2) + (b / 2) + 1;
      } // if there are two odd numbers account for
        // under counting
    else
      {
        return (a / 2) + (b / 2);
      } // else there won't be under count
  } // midpoint(int, int)
  
  /**
   * Search for val in values, return the index of an instance of val.
   * 
   * @param val
   *          An integer we're searching for
   * @param values
   *          A sorted array of integers
   * @result index, an integer
   * @throws Exception
   *           If there is no i s.t. values[i] == val
   * @pre values is sorted in increasing order. That is, values[i] < values[i+1]
   *      for all reasonable i.
   * @post values[index] == val
   */
  
  public static int binarySearch(int i, int[] vals, int lb, int ub)
    throws Exception
  { 
    if (lb > ub)
      {
        throw new Exception(i + " not found in vals.");
      } // if lb is greater than ub then i is not in vals
        
    // Get the midpoint value.
    int mid = midpoint(lb, ub);
    
    if (vals[mid] == i)
      {
        return mid;
      } // if the value at mid is the value we are
        // looking for
    else if (vals[mid] < i)
      {
        return binarySearch(i, vals, mid + 1, ub);
      } // else if the mid is less than i then call
        // binarySearch again with mid+1 as the new lb
    else
      {
        return binarySearch(i, vals, lb, mid - 1);
      } // else the mid is greater than i then call
        // binarySearch again with mid-1 as the new ub
  } // binarySearch(int, int, int, int)
} // class binarySearch

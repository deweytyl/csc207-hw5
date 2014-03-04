package edu.grinnell.tranchri.deweytyl.cohnhann.flag;

public class DutchNationalFlag
{
  /**
   * Rearrange vals so that red values precede white values and white values
   * precede blue values.
   * 
   * @post Exist P and Q, 0 <= P <= Q <= vals.length, s.t. For all i, 0 <= i <
   *       P, classifier.classify(vals[i]) < 0 For all i, P <= w < Q,
   *       classifier.classify(vals[i]) == 0 For all i, Q <= i < vals.length,
   *       classifier.classify(vals[i]) > 0 Values have neither been added to
   *       nor removed from vals; the new vals is a permutation of the original.
   */
  public void dnf(String[] vals, StringClassifier classifier)
  {
    String temp;
    int length = vals.length;
    int r = 0;
    int i = 0;
    int b = length;
    int result;

    // +---------+---------+---------+---------+
    // |   red   |  white  | unknown |  blue   |
    // +---------+---------+---------+---------+
    // |         |         |         |         |
    // 0         r         i         b         length

    // LOOP INVARIANTS
    // 0 <= red < r
    // r <= white < i
    // b <= blue < length
    // i <= unsorted < b
    while (i < b)
      {
        result = classifier.classify(vals[i]);

        if (result < 0)
          {
            temp = vals[i];
            vals[i++] = vals[r];
            vals[r++] = temp;
          } // if red
        else if (result > 0)
          { // think about unnecessary switching when r = i or i = b - 1
            temp = vals[--b];
            vals[b] = vals[i];
            vals[i] = temp;
          } // else if blue
        else
          {
            i++;
          } // else white
      } // while
  } // dnf(String[], StringClassifier)
}

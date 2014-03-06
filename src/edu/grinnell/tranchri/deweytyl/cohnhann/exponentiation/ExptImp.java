package edu.grinnell.tranchri.deweytyl.cohnhann.exponentiation;

import java.util.ArrayList;

public class ExptImp
{
  /**
   * Compute x^n.
   * 
   * @pre n >= 1.
   */
  public static double expt(double x, int n)
  {
    ArrayList<Integer> actions = new ArrayList<Integer>();
    double result = 1;

    while(n >= 0)
      {
        if (n == 0)
          {
            for (int j = 0; j < actions.size(); j++)
              {
                if (actions.get(j) == 0)
                  {
                    result *= x * x;
                  } // if 
                else
                  {
                    result *= x;
                  } // else
              } // for
            break;
          } // if
        else if (n % 2 == 0)
          {
            actions.add(0);
            n -= 2;
          } // else if the power is even then put 0
            // into actions to signify squaring.
        else if (n % 2 == 1)
          {
            actions.add(1);
            n--;
          } // else if the power is odd then put 1
            // into actions to signify times by base.
      } // while

    return result;
  } // expt(double, int)
}

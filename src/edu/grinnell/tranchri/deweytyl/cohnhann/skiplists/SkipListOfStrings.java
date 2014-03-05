package edu.grinnell.tranchri.deweytyl.cohnhann.skiplists;

public class SkipListOfStrings
{
  SkipListNode[] head;
  SkipListNode[] prev;
  SkipListNode[] next;

  int maxLevel;

  /**
   * SkipListOfStrings
   */
  public SkipListOfStrings()
  {

  } // SkipListOfStrings

  /**
   * add
   */
  public void add(String str)
  {
    // STUB
  } // add(String)

  /**
   * remove
   */
  public void remove(String str)
  {
    // STUB
  } // remove(String)
  
  public boolean contains(String str)
  {
    return false; // STUB
  } // contains(String)
  
  private void increaseMaxLevel(int lvl)
  {
    if (lvl > this.maxLevel)
      {
        SkipListNode[] expanded = new SkipListNode[lvl];
        for (int i = 0; i < this.head.length; i++)
          {
            expanded[i] = this.head[i];
          } // for
        this.head = expanded;
      } // if 
  } // increaseMaxLevel(int)
} // class SkipListOfStrings

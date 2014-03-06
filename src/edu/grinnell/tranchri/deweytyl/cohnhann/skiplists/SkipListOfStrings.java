package edu.grinnell.tranchri.deweytyl.cohnhann.skiplists;

public class SkipListOfStrings
{
  SkipListNode[] head; // How do we want to implement head? an empty node? or just the pointers?
  SkipListNode[] prev;
  SkipListNode[] next;

  // Additionally, we need to think about what NIL means in this context.
  // ~design decisions~

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

package edu.grinnell.tranchri.deweytyl.cohnhann.skiplists;

public class SkipListOfStrings
{
  SkipListNode head; // How do we want to implement head? an empty node? or
                     // just the pointers?
  SkipListNode[] prev;

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

  /**
   * Finds where a string SHOULD fit into the skip list
   * 
   * @param str
   * @return If str DOES NOT exist, an array of SkipListNodes that overshoot the
   *         place of str by one step at the level denoted by their index within
   *         the array. If str DOES exist, an array of SkipList Nodes that
   *         either overshoot the place of str by one step at the level denoted
   *         by their index within the array, or point directly to the node
   *         containing str.
   */
  private SkipListNode[] findPlace(String str)
  {
    int lvl = this.maxLevel;
    SkipListNode[] previousNodes = new SkipListNode[this.maxLevel+1];
    SkipListNode currentNode = head;
    String nextString;

    while (lvl >= 0)
      {
        if ((str.compareTo((nextString = currentNode.peek(lvl))) <= 0)
            || nextString == "NIL")
          {
            // if str belongs before the next node at this level
            previousNodes[lvl--] = currentNode; // move down a level
          } // if
        else if (str.compareTo(nextString) > 0)
          {
            // if str belongs after the next node at this level
            currentNode = currentNode.next[lvl];
            // move to the next node
          } // else if
        else
          {
            while (lvl >= 0)
              {
                previousNodes[lvl--] = currentNode;
              } // while
            return previousNodes;
          } // else
      } // while
    return null;
  }

  private void increaseMaxLevel(int lvl)
  {
    if (lvl > this.maxLevel)
      {
        SkipListNode[] expanded = new SkipListNode[lvl];
        for (int i = 0; i < this.head.next.length; i++)
          {
            expanded[i] = this.head.next[i];
          } // for
        this.head.next = expanded;
        this.head.level = this.head.next.length;
      } // if
  } // increaseMaxLevel(int)
} // class SkipListOfStrings

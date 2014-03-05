package edu.grinnell.tranchri.deweytyl.cohnhann.skiplists;

public class SkipListNode
{

  String contents;
  SkipListNode[] pointers;
  int level;

  public SkipListNode(String stuff, int lvl)
  {
    contents = stuff;
    pointers = new SkipListNode[lvl+1]; // is lvl max level or num levels?
    level = pointers.length;
  } // SkipListNode<T>(T, int)

  /**
   * getNext(int lvl)
   * 
   * Returns a reference to the next node at level lvl
   */
  public SkipListNode getNext(int lvl)
  {
    return pointers[lvl];
  } // getNext(int)
  
  /**
   * setNext(SkipListOfStringsNode node, int lvl)
   * 
   * Set
   */
  public void setNext(SkipListNode node, int lvl)
  {
    pointers[lvl] = node;
  } // setNext(SkipListOfStringsNode, int)
  
  /**
   * peek(int lvl)
   * 
   * Returns the value of the next node or null if the node does not point to
   * any other nodes at that level
   */
  public String peek(int lvl)
  {
    return pointers[lvl].contents;
  } // peek(int)
} // class SkipListOfStringsNode

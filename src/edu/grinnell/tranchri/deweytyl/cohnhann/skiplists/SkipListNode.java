package edu.grinnell.tranchri.deweytyl.cohnhann.skiplists;

import java.util.Random;

public class SkipListNode
{

  String contents;
  SkipListNode[] next;
  int level;

  public SkipListNode(String stuff, int lvl)
  {
    contents = stuff;
    next = new SkipListNode[lvl+1]; // is lvl max level or num levels?
    level = next.length;
  } // SkipListNode<T>(T, int)

  /**
   * getNext(int lvl)
   * 
   * Returns a reference to the next node at level lvl
   */
  public SkipListNode getNext(int lvl)
  {
    return next[lvl];
  } // getNext(int)
  
  /**
   * setNext(SkipListOfStringsNode node, int lvl)
   * 
   * Set
   */
  public void setNext(SkipListNode node, int lvl)
  {
    next[lvl] = node;
  } // setNext(SkipListOfStringsNode, int)
  
  /**
   * peek(int lvl)
   * 
   * Returns the value of the next node or null if the node does not point to
   * any other nodes at that level
   */
  public String peek(int lvl)
  {
    return next[lvl].contents;
  } // peek(int)
} // class SkipListOfStringsNode

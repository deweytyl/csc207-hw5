package edu.grinnell.tranchri.deweytyl.cohnhann.skiplists;

public class SkipListOfStringsNode {

	String contents;
	SkipListOfStringsNode[] pointers;
	int maxLevel;

	public SkipListOfStringsNode(String stuff, int lvl) {
		contents = stuff;
		pointers = new SkipListOfStringsNode[lvl];
		maxLevel = pointers.length;
	} // SkipListNode<T>(T, int)

	/**
	 * getNext(int lvl)
	 * 
	 * Returns a reference to the next node at level lvl
	 */

	/**
	 * setNext(int level)
	 * 
	 * Sets a
	 */

	/**
	 * peek(int lvl)
	 * 
	 * Returns the value of the next node or null if the node does not point to
	 * any other nodes at that level
	 */
} // class SkipListOfStringsNode
